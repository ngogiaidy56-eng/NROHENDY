#!/usr/bin/env python3
"""Generate Java model/SQL scaffolding and schema documentation from hendy.sql."""
from __future__ import annotations

import argparse
import hashlib
import json
import re
import sys
from pathlib import Path
from typing import Any

BT = chr(96)
IDENT = r"\x60(?:\x60\x60|[^\x60])+\x60"
CREATE_RE = re.compile(rf"\bCREATE\s+TABLE\s+(?:IF\s+NOT\s+EXISTS\s+)?(?P<name>{IDENT}|[A-Za-z0-9_$]+)\s*\(", re.I)
ALTER_RE = re.compile(rf"\bALTER\s+TABLE\s+(?P<name>{IDENT}|[A-Za-z0-9_$]+)(?P<body>[\s\S]*?);", re.I)
COLUMN_RE = re.compile(
    rf"^\s*(?P<name>{IDENT})\s+"
    r"(?P<type>[A-Za-z]+(?:\s*\([^)]*\))?(?:\s+(?:unsigned|zerofill|precision))*)\s*"
    r"(?P<rest>[\s\S]*)$", re.I
)
MANIFEST_PATH = "src/com/girlkun/generated/metadata/manifest.json"
GENERATED_PREFIX = "src/com/girlkun/generated/"
DOC_PATH = "docs/database/schema-reference.md"
JAVA_KEYWORDS = set((
    "abstract assert boolean break byte case catch char class const continue default do double else enum "
    "extends final finally float for goto if implements import instanceof int interface long native new package "
    "private protected public return short static strictfp super switch synchronized this throw throws transient "
    "try void volatile while true false null _"
).split())


def unquote(token: str) -> str:
    token = token.strip()
    return token[1:-1].replace(BT + BT, BT) if token.startswith(BT) and token.endswith(BT) else token


def group_at(text: str, opening: int) -> tuple[str, int]:
    depth, quote, escaped, i = 0, None, False, opening
    while i < len(text):
        char = text[i]
        if quote is not None:
            if escaped:
                escaped = False
            elif char == "\\":
                escaped = True
            elif char == quote:
                if i + 1 < len(text) and text[i + 1] == quote:
                    i += 1
                else:
                    quote = None
        elif char in ("'", '"', BT):
            quote = char
        elif char == "(":
            depth += 1
        elif char == ")":
            depth -= 1
            if depth == 0:
                return text[opening + 1:i], i
        i += 1
    raise ValueError("Unclosed parenthesis in SQL")


def split_top(text: str, separator: str = ",") -> list[str]:
    result, start, depth, quote, escaped, i = [], 0, 0, None, False, 0
    while i < len(text):
        char = text[i]
        if quote is not None:
            if escaped:
                escaped = False
            elif char == "\\":
                escaped = True
            elif char == quote:
                if i + 1 < len(text) and text[i + 1] == quote:
                    i += 1
                else:
                    quote = None
        elif char in ("'", '"', BT):
            quote = char
        elif char == "(":
            depth += 1
        elif char == ")":
            depth -= 1
        elif char == separator and depth == 0:
            item = text[start:i].strip()
            if item:
                result.append(item)
            start = i + 1
        i += 1
    if text[start:].strip():
        result.append(text[start:].strip())
    return result


def identifier_list(value: str) -> list[str]:
    result = []
    for item in split_top(value):
        match = re.match(rf"^\s*({IDENT}|[A-Za-z0-9_$]+)", item)
        result.append(unquote(match.group(1)) if match else item.strip())
    return result


def sql_to_java(sql_type: str) -> str:
    normalized = re.sub(r"\s+", " ", sql_type.lower()).strip()
    match = re.match(r"[a-z]+", normalized)
    kind = match.group(0) if match else "text"
    if kind == "tinyint":
        return "Boolean" if re.search(r"\(\s*1\s*\)", normalized) else "Byte"
    if kind == "smallint":
        return "Short"
    if kind in {"int", "integer", "mediumint"}:
        return "Integer"
    if kind == "bigint":
        return "Long"
    if kind in {"decimal", "numeric"}:
        return "java.math.BigDecimal"
    if kind == "float":
        return "Float"
    if kind in {"double", "real"}:
        return "Double"
    if kind == "date":
        return "java.sql.Date"
    if kind in {"timestamp", "datetime"}:
        return "java.sql.Timestamp"
    if kind == "time":
        return "java.sql.Time"
    if kind in {"binary", "varbinary", "tinyblob", "blob", "mediumblob", "longblob"}:
        return "byte[]"
    return "String"


def field_name(name: str) -> str:
    value = name.lower() if re.fullmatch(r"[A-Z0-9_]+", name) else name
    if "_" in value:
        parts = [p for p in re.split(r"[^a-z0-9]+", value.lower()) if p]
        value = "".join(p if i == 0 else p[:1].upper() + p[1:] for i, p in enumerate(parts))
    value = re.sub(r"[^A-Za-z0-9_$]", "", value) or "field"
    if value[0].isdigit():
        value = "field" + value
    if value in JAVA_KEYWORDS:
        value += "Value"
    return value[:1].lower() + value[1:]


def pascal_name(name: str) -> str:
    value = name.lower() if re.fullmatch(r"[A-Z0-9_]+", name) else name
    parts = [p for p in re.split(r"[^A-Za-z0-9]+", value) if p]
    result = "".join(p[:1].upper() + p[1:] for p in parts) or "Generated"
    if result[0].isdigit():
        result = "T" + result
    if result.lower() in JAVA_KEYWORDS:
        result += "Table"
    return result


def constant_name(name: str) -> str:
    value = re.sub(r"([a-z0-9])([A-Z])", r"\1_\2", name)
    return re.sub(r"[^A-Za-z0-9]+", "_", value).upper().strip("_") or "COLUMN"


def add_constraint(segment: str, table: dict[str, Any]) -> None:
    raw = re.sub(r"^\s*ADD\s+", "", segment.strip(), flags=re.I)
    match = re.match(r"^PRIMARY\s+KEY\s*", raw, re.I)
    if match:
        group, _ = group_at(raw, raw.find("(", match.end() - 1))
        table["primary_key"] = identifier_list(group)
        return
    match = re.match(rf"^CONSTRAINT\s+({IDENT}|[A-Za-z0-9_$]+)\s+FOREIGN\s+KEY\s*", raw, re.I)
    if match:
        name = unquote(match.group(1))
        local, local_end = group_at(raw, raw.find("(", match.end() - 1))
        rest = raw[local_end + 1:]
        ref = re.search(rf"\bREFERENCES\s+({IDENT}|[A-Za-z0-9_$]+)\s*", rest, re.I)
        if not ref:
            return
        ref_table = unquote(ref.group(1))
        ref_cols, _ = group_at(rest, rest.find("(", ref.end() - 1))
        delete = re.search(r"\bON\s+DELETE\s+([A-Z ]+?)(?=\s+ON\s+UPDATE|\s*$)", rest, re.I)
        update = re.search(r"\bON\s+UPDATE\s+([A-Z ]+?)(?=\s+ON\s+DELETE|\s*$)", rest, re.I)
        fk = {
            "name": name, "columns": identifier_list(local), "referenced_table": ref_table,
            "referenced_columns": identifier_list(ref_cols),
            "on_delete": delete.group(1).strip().upper() if delete else None,
            "on_update": update.group(1).strip().upper() if update else None,
        }
        if fk not in table["foreign_keys"]:
            table["foreign_keys"].append(fk)
        return
    match = re.match(r"^(UNIQUE\s+(?:KEY|INDEX)|KEY|INDEX)\s*", raw, re.I)
    if match:
        kind = match.group(1).upper()
        rest = raw[match.end():].strip()
        index_name = None
        name_match = re.match(rf"^({IDENT}|[A-Za-z0-9_$]+)\s*", rest)
        if name_match and not rest.startswith("("):
            index_name = unquote(name_match.group(1))
            rest = rest[name_match.end():]
        opening = rest.find("(")
        if opening < 0:
            return
        group, _ = group_at(rest, opening)
        unique = kind.startswith("UNIQUE")
        index = {"name": index_name, "columns": identifier_list(group), "unique": unique,
                 "type": "UNIQUE" if unique else kind}
        if not any(x["name"] == index["name"] and x["columns"] == index["columns"]
                   and x["unique"] == index["unique"] for x in table["indexes"]):
            table["indexes"].append(index)


def parse_schema(text: str) -> list[dict[str, Any]]:
    tables, by_name = [], {}
    for match in CREATE_RE.finditer(text):
        name = unquote(match.group("name"))
        body, _ = group_at(text, match.end() - 1)
        table = {"name": name, "columns": [], "primary_key": [], "indexes": [], "foreign_keys": []}
        for segment in split_top(body):
            column_match = COLUMN_RE.match(segment)
            if not column_match:
                add_constraint(segment, table)
                continue
            col_name = unquote(column_match.group("name"))
            sql_type, rest = column_match.group("type").strip(), column_match.group("rest") or ""
            default = re.search(
                r"""\bDEFAULT\s+('(?:''|\\.|[^'])*'|"(?:\"\"|\\.|[^"])*"|[^\s,]+)""",
                rest, re.I
            )
            table["columns"].append({
                "name": col_name, "sql_type": sql_type, "java_type": sql_to_java(sql_type),
                "nullable": not bool(re.search(r"\bNOT\s+NULL\b", rest, re.I)),
                "auto_increment": bool(re.search(r"\bAUTO_INCREMENT\b", rest, re.I)),
                "default": default.group(1) if default else None,
            })
        if not table["columns"]:
            raise ValueError(f"No columns parsed from table {name}")
        if name in by_name:
            raise ValueError(f"Duplicate table definition: {name}")
        tables.append(table)
        by_name[name] = table

    for match in ALTER_RE.finditer(text):
        table = by_name.get(unquote(match.group("name")))
        if table is None:
            continue
        for clause in split_top(match.group("body")):
            modified = re.match(rf"^\s*MODIFY(?:\s+COLUMN)?\s+(?P<name>{IDENT})\s+(?P<rest>[\s\S]*)$", clause, re.I)
            if modified:
                column = next((c for c in table["columns"] if c["name"] == unquote(modified.group("name"))), None)
                if column:
                    column["auto_increment"] = bool(re.search(r"\bAUTO_INCREMENT\b", modified.group("rest"), re.I))
                    if re.search(r"\bNOT\s+NULL\b", modified.group("rest"), re.I):
                        column["nullable"] = False
            else:
                add_constraint(clause, table)

    classes, names = set(), set()
    for table in tables:
        if table["name"] in names:
            raise ValueError(f"Duplicate table definition: {table['name']}")
        names.add(table["name"])
        table["class_name"] = pascal_name(table["name"])
        if table["class_name"] in classes:
            raise ValueError(f"Generated class-name collision: {table['class_name']}")
        classes.add(table["class_name"])
        used_fields, used_constants = set(), set()
        for column in table["columns"]:
            base = field_name(column["name"])
            field, suffix = base, 2
            while field in used_fields:
                field = f"{base}{suffix}"
                suffix += 1
            column["field_name"] = field
            used_fields.add(field)
            base_constant = constant_name(column["name"])
            constant, suffix = base_constant, 2
            while constant in used_constants:
                constant = f"{base_constant}_{suffix}"
                suffix += 1
            column["constant_name"] = constant
            used_constants.add(constant)
        table["primary_key"] = list(dict.fromkeys(table["primary_key"]))
    if not tables:
        raise ValueError("No CREATE TABLE statements found")
    return tables


def java_literal(value: str) -> str:
    escaped = str(value).replace("\\", "\\\\").replace('"', '\\"')
    return '"' + escaped.replace("\r", "\\r").replace("\n", "\\n").replace("\t", "\\t") + '"'


def sql_identifier(value: str) -> str:
    return BT + value.replace(BT, BT + BT) + BT


def render_model(table: dict[str, Any]) -> str:
    lines = [
        "package com.girlkun.generated.model;", "",
        "/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */",
        f"public class {table['class_name']}Row {{",
        f"    public static final String TABLE_NAME = {java_literal(table['name'])};",
    ]
    for column in table["columns"]:
        lines.append(f"    public static final String COLUMN_{column['constant_name']} = {java_literal(column['name'])};")
    lines.append("")
    for column in table["columns"]:
        lines.append(f"    private {column['java_type']} {column['field_name']};")
    lines.extend(["", f"    public {table['class_name']}Row() {{", "    }"])
    for column in table["columns"]:
        field, kind = column["field_name"], column["java_type"]
        cap = field[:1].upper() + field[1:]
        lines.extend(["", f"    public {kind} get{cap}() {{", f"        return this.{field};", "    }",
                      "", f"    public void set{cap}({kind} {field}) {{", f"        this.{field} = {field};", "    }"])
    lines.extend(["}", ""])
    return "\n".join(lines)


def render_sql_class(table: dict[str, Any]) -> str:
    columns = ", ".join(sql_identifier(c["name"]) for c in table["columns"])
    select = f"SELECT {columns} FROM {sql_identifier(table['name'])}"
    lines = [
        "package com.girlkun.generated.sql;", "",
        "/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */",
        f"public final class {table['class_name']}Sql {{",
        f"    public static final String TABLE_NAME = {java_literal(table['name'])};",
        f"    public static final String COLUMNS = {java_literal(columns)};",
        f"    public static final String SELECT_ALL = {java_literal(select)};",
        f"    public static final String COUNT_ALL = {java_literal('SELECT COUNT(*) FROM ' + sql_identifier(table['name']))};",
    ]
    if table["primary_key"]:
        where = " AND ".join(f"{sql_identifier(key)} = ?" for key in table["primary_key"])
        lines.append(f"    public static final String PRIMARY_KEY_COLUMNS = {java_literal(', '.join(table['primary_key']))};")
        lines.append(f"    public static final String SELECT_BY_PRIMARY_KEY = {java_literal(select + ' WHERE ' + where)};")
    lines.extend(["", f"    private {table['class_name']}Sql() {{", "    }", "}", ""])
    return "\n".join(lines)


def render_reference(tables: list[dict[str, Any]]) -> str:
    lines = ["# Generated database schema reference", "",
             "Generated from hendy.sql by tools/sql-scaffold/generate.py. Do not edit directly.",
             "", f"Tables: **{len(tables)}**.", ""]
    for table in tables:
        lines.extend([f"## {table['name']}", "", f"Java model: {table['class_name']}Row", "",
                      "| Column | SQL type | Java type | Nullable | Default | Auto increment |",
                      "|---|---|---|---|---|---|"])
        for column in table["columns"]:
            default = "—" if column["default"] is None else str(column["default"]).replace("|", r"\|").replace("\n", " ")
            lines.append(f"| {column['name']} | {column['sql_type']} | {column['java_type']} | "
                         f"{'YES' if column['nullable'] else 'NO'} | {default} | "
                         f"{'YES' if column['auto_increment'] else 'NO'} |")
        lines.append("")
        lines.append("Primary key: " + (", ".join(table["primary_key"]) if table["primary_key"] else "not declared"))
        for index in table["indexes"]:
            label = "Unique index" if index["unique"] else "Index"
            lines.append(f"{label}: {index['name'] or '(unnamed)'} ({', '.join(index['columns'])})")
        for fk in table["foreign_keys"]:
            note = f"Foreign key {fk['name']}: {', '.join(fk['columns'])} → {fk['referenced_table']} ({', '.join(fk['referenced_columns'])})"
            if fk["on_delete"]:
                note += "; ON DELETE " + fk["on_delete"]
            if fk["on_update"]:
                note += "; ON UPDATE " + fk["on_update"]
            lines.append(note)
        lines.append("")
    return "\n".join(lines) + "\n"


def render_outputs(schema_text: str, tables: list[dict[str, Any]], source_label: str) -> dict[str, str]:
    digest = hashlib.sha256(schema_text.encode("utf-8")).hexdigest()
    table_data = []
    for table in tables:
        table_data.append({
            "name": table["name"], "class_name": table["class_name"],
            "java_model": f"src/com/girlkun/generated/model/{table['class_name']}Row.java",
            "java_sql": f"src/com/girlkun/generated/sql/{table['class_name']}Sql.java",
            "primary_key": table["primary_key"], "indexes": table["indexes"], "foreign_keys": table["foreign_keys"],
            "columns": [{key: c[key] for key in ("name", "field_name", "sql_type", "java_type", "nullable", "auto_increment", "default")}
                        for c in table["columns"]],
        })
    outputs = {
        "src/com/girlkun/generated/README.md": (
            "# Generated NROHENDY schema scaffolding\n\n"
            "This directory is generated from SQL table definitions. Do not edit generated files by hand.\n\n"
            "Regenerate locally with: python tools/sql-scaffold/generate.py --prune\n\n"
            "Generated model classes are data-transfer objects only. Generated SQL classes contain query strings, "
            "not database connections, authentication, transaction handling or DAO implementations.\n\n"
            "Review schema changes and test against a disposable database before production rollout.\n"
        ),
        "src/com/girlkun/generated/metadata/schema.json": json.dumps({
            "source": source_label, "source_sha256": digest, "table_count": len(tables), "tables": table_data
        }, ensure_ascii=False, indent=2) + "\n",
        "docs/database/schema-reference.md": render_reference(tables),
    }
    for table in tables:
        outputs[f"src/com/girlkun/generated/model/{table['class_name']}Row.java"] = render_model(table)
        outputs[f"src/com/girlkun/generated/sql/{table['class_name']}Sql.java"] = render_sql_class(table)
    outputs[MANIFEST_PATH] = json.dumps({
        "generator": "tools/sql-scaffold/generate.py", "source": source_label, "source_sha256": digest,
        "table_count": len(tables), "generated_files": sorted(outputs),
    }, ensure_ascii=False, indent=2) + "\n"
    return outputs


def previous_files(root: Path) -> list[str]:
    path = root / MANIFEST_PATH
    if not path.is_file():
        return []
    try:
        items = json.loads(path.read_text(encoding="utf-8")).get("generated_files", [])
        return [item for item in items if isinstance(item, str)] if isinstance(items, list) else []
    except (OSError, json.JSONDecodeError):
        return []


def safe_generated(path: str) -> bool:
    return path.startswith(GENERATED_PREFIX) or path == DOC_PATH


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--root", type=Path, default=Path(__file__).resolve().parents[2])
    parser.add_argument("--schema", type=Path, default=Path("hendy.sql"), help="schema path relative to root or absolute")
    parser.add_argument("--output-root", type=Path, default=None, help="output root; defaults to repository root")
    parser.add_argument("--check", action="store_true", help="check generated files without writing")
    parser.add_argument("--prune", action="store_true", help="remove only stale paths recorded in the prior manifest")
    args = parser.parse_args()
    if args.check and args.prune:
        parser.error("--check and --prune cannot be used together")
    root = args.root.resolve()
    schema_path = args.schema if args.schema.is_absolute() else root / args.schema
    output_root = args.output_root or root
    if not output_root.is_absolute():
        output_root = root / output_root
    output_root = output_root.resolve()
    if not schema_path.is_file():
        print(f"Schema file not found: {schema_path}", file=sys.stderr)
        return 2
    schema_text = schema_path.read_text(encoding="utf-8")
    tables = parse_schema(schema_text)
    outputs = render_outputs(schema_text, tables, schema_path.name)
    if args.check:
        mismatches = []
        for relative, expected in outputs.items():
            path = output_root / relative
            if not path.is_file():
                mismatches.append("missing: " + relative)
            elif path.read_text(encoding="utf-8") != expected:
                mismatches.append("modified: " + relative)
        stale = [p for p in previous_files(output_root) if p not in outputs and safe_generated(p) and (output_root / p).is_file()]
        mismatches.extend("stale: " + path for path in stale)
        if mismatches:
            print("Generated files are out of date:", file=sys.stderr)
            print("\n".join(" - " + item for item in mismatches), file=sys.stderr)
            return 1
        manifest = json.loads(outputs[MANIFEST_PATH])
        print(f"PASS: {len(outputs)} files match {manifest['table_count']} SQL tables.")
        return 0
    if args.prune:
        expected = set(outputs)
        for relative in previous_files(output_root):
            if relative not in expected and safe_generated(relative):
                old = output_root / relative
                if old.is_file():
                    old.unlink()
    for relative, content in outputs.items():
        target = output_root / relative
        target.parent.mkdir(parents=True, exist_ok=True)
        target.write_text(content, encoding="utf-8", newline="\n")
    print(f"Generated {len(outputs)} files from {len(tables)} SQL tables.")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
