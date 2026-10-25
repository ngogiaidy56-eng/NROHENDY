# Database

## Contents
- Root `hendy.sql`: **schema only** (45 legacy tables plus indexes, constraints and the `SPLIT_STR` routine).
- `seeds/game-static-data.sql`: game templates and lookup rows needed for maps, items, mobs, parts, skills, shops and related catalogs.
- `migrations/`: future versioned, reviewed schema changes.
- `schema/`: schema documentation.
- `docs/`: backup, restore and schema review notes.

## Safe setup
1. Create a fresh test database named `hendy`.
2. Import `hendy.sql`.
3. Import `database/seeds/game-static-data.sql`.
4. Verify required row counts and start the Java application in staging.
5. Only then prepare a reviewed migration plan for the live database.

Never import into a live database without a verified backup and tested restore. DDL can implicitly commit in MySQL/MariaDB.

## Privacy
The original dump included rows from account, player, guild, gift-code and top-up tables. Those data rows have been excluded from this public schema/seed split. The table definitions remain so the game server can create its own records. Do not restore actual account/player/payment data from a public repository.

## Legacy compatibility
The source dump reports MariaDB 10.4.28 and mixes `latin1`, legacy `utf8`, and `utf8mb4` collations. These are not normalized automatically because changing column collations can alter comparisons or stored text. Review `docs/DB_SCHEMA_AUDIT.md` before making a charset migration.