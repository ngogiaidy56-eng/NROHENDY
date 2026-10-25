# NROHENDY — Java game-server source workspace

This repository contains a reviewed database baseline, static game-template data, a schema-driven scaffolding generator and an expanded Java package layout. It is **not yet a complete runnable NRO server**: the original Java implementation, verified protocol handlers, build file, runtime dependencies and game assets still need integration from the legacy source.

## Automatic generation from hendy.sql

The generator reads CREATE TABLE definitions (including keys and foreign keys declared in ALTER TABLE statements) and creates a Java model plus SQL-constant class for each table, JSON schema metadata and a Markdown schema reference. Generated files live in a separate package and do not overwrite handwritten code.

Run locally:

```sh
python -m unittest discover -s tools/sql-scaffold/tests -p "test_*.py"
python tools/sql-scaffold/generate.py --prune
python tools/sql-scaffold/generate.py --check
```

Windows users can run `scripts/generate-schema-scaffold.bat`; Linux/macOS users can run `scripts/generate-schema-scaffold.sh`.

When hendy.sql or the generator changes on main, GitHub Actions runs the parser tests, validates the SQL baseline, regenerates the files and commits generated updates when needed. Generated models are DTOs and SQL classes contain query strings only; they do not implement database connections, working DAOs, authentication, transactions or gameplay.

## Database layout

- hendy.sql: schema only; contains no table data inserts.
- database/seeds/game-static-data.sql: static maps, items, mobs, parts, skills, shops and lookup data.
- database/migrations/: reviewed schema-change instructions.
- docs/database/schema-reference.md: generated table and column reference.
- src/com/girlkun/generated/: generated models, SQL constants, metadata and manifest.

The public dump omits account/password rows, player save-state rows, guild state, gift codes and top-up records. Never commit live credentials or player/payment data. Import SQL only into a fresh test database before production.

## Build status

The original Java implementation, verified network protocol, build.xml, manifest.mf, run.bat, runtime libraries and actual game assets still need integration before a live server can be built and tested. Schema generation does not prove gameplay compatibility.
