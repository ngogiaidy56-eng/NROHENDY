# NROHENDY — Java game-server source workspace

This repository currently contains a reviewed database baseline, static game-template data, an expanded Java package layout and operational documentation. It is **not yet a complete runnable NRO server**: the original Java implementation, verified protocol handlers, build file, runtime dependencies and game assets must be integrated from the existing project before gameplay can be tested.

## Database layout

- `hendy.sql`: schema only; contains no table data inserts.
- `database/seeds/game-static-data.sql`: static maps, items, mobs, parts, skills, shops and template/look-up data only.
- `database/migrations/`: future versioned schema changes.
- `database/backups/` and `database/private/`: local/private only; never commit real account, player, payment, token or gift-code records.

The legacy dump contained user/runtime rows. The public working version omits account/password rows, player save-state rows, guild membership state, gift codes and top-up records. Keep any original data only in a private, access-controlled backup.

## Import into a fresh test database

Create a new database first; do not run this sequence against an existing live schema:

```sh
mysql -u root -p -e "CREATE DATABASE IF NOT EXISTS hendy CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;"
mysql -u <migration_user> -p hendy < hendy.sql
mysql -u <migration_user> -p hendy < database/seeds/game-static-data.sql
```

The schema contains a stored function. The migration identity needs the appropriate routine privilege. Use a separate least-privilege account for the running game server. Details and caveats are in `database/README.md` and `docs/DB_SCHEMA_AUDIT.md`.

## Source structure

- `src/com/girlkun/`: existing/expected Java packages for server, network, models, DAO and services.
- `data/girlkun/`: expected game resources; the folder markers are not actual image/map data.
- `lib/`: place only dependencies whose versions and licenses have been verified.
- `docs/`, `test/`, `ops/`, `scripts/`: implementation, safety, validation and runbook materials.

## Validation

Run `python scripts/validate_sql.py` to statically check the schema/seed split and ensure user-specific tables are not seeded. This validation does not connect to MySQL and does not prove Java compilation or gameplay compatibility.