#!/usr/bin/env python3
"""Static safety checks for the NROHENDY SQL baseline; does not connect to a database."""
from pathlib import Path
import json
import re
import sys

ROOT = Path(__file__).resolve().parents[1]
SCHEMA_PATH = ROOT / "hendy.sql"
SEED_PATH = ROOT / "database" / "seeds" / "game-static-data.sql"
CONFIG_PATH = ROOT / "data" / "config" / "database.json.example"

ALLOWED_SEED_TABLES = {
    "archive_template", "bg_item_template", "caption", "card", "dhvt_template",
    "flag_bag", "head_avatar", "img_by_name", "intrinsic", "item_option_template",
    "item_shop", "item_shop_option", "item_template", "map_template", "mob_template",
    "nclass", "npc_template", "part", "radar", "shop", "side_task_template",
    "skill_template", "small_version", "tab_shop", "task_main_template",
    "task_sub_template", "type_item", "type_map", "type_sell_item_shop",
}
PROTECTED_TABLES = {
    "account", "player", "clan_sv1", "clan_sv2", "giftcode", "naptien",
    "recharge_card", "token", "post_question", "comment", "history_event",
    "history_gold", "history_receive_goldbar", "history_transaction", "shop_ky_gui",
}

def fail(message: str) -> None:
    print(f"ERROR: {message}", file=sys.stderr)
    raise SystemExit(1)

for path in (SCHEMA_PATH, SEED_PATH, CONFIG_PATH):
    if not path.is_file():
        fail(f"required file missing: {path.relative_to(ROOT)}")

schema = SCHEMA_PATH.read_text(encoding="utf-8")
seeds = SEED_PATH.read_text(encoding="utf-8")

if re.search(r"^\s*INSERT\s+INTO\b", schema, re.IGNORECASE | re.MULTILINE):
    fail("hendy.sql must remain schema-only; put static rows in the seed file")
if re.search(r"CREATE\s+DEFINER\s*=", schema, re.IGNORECASE):
    fail("schema contains an explicit DEFINER")
if re.search(r"\bDROP\s+(?:DATABASE|TABLE)\b", schema, re.IGNORECASE):
    fail("destructive DROP statement found in schema baseline")

tables = set(re.findall(r"CREATE\s+TABLE\s+`([^`]+)`", schema, re.IGNORECASE))
required_tables = {"account", "player", "item_template", "map_template", "mob_template", "part", "skill_template"}
missing = required_tables - tables
if missing:
    fail("missing required legacy tables: " + ", ".join(sorted(missing)))
if len(tables) < 40:
    fail(f"unexpectedly few tables detected: {len(tables)}")

seed_tables = set(re.findall(r"^\s*INSERT\s+INTO\s+`([^`]+)`", seeds, re.IGNORECASE | re.MULTILINE))
if not seed_tables:
    fail("static seed file contains no INSERT statements")
unknown = seed_tables - ALLOWED_SEED_TABLES
if unknown:
    fail("unexpected table in static seed file: " + ", ".join(sorted(unknown)))
protected = seed_tables & PROTECTED_TABLES
if protected:
    fail("protected/runtime table data found in public seeds: " + ", ".join(sorted(protected)))
unknown_schema_tables = seed_tables - tables
if unknown_schema_tables:
    fail("seed references tables absent from schema: " + ", ".join(sorted(unknown_schema_tables)))

try:
    json.loads(CONFIG_PATH.read_text(encoding="utf-8"))
except json.JSONDecodeError as exc:
    fail(f"database.json.example is invalid JSON: {exc}")

print(f"PASS: {len(tables)} tables in schema; schema contains no data INSERTs or explicit DEFINER.")
print(f"PASS: {len(seed_tables)} allowed static-data tables; no account/player/payment/gift-code rows.")
print("NOTE: static checks do not validate SQL execution, Java compilation, or client protocol compatibility.")
