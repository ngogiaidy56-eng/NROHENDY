# Schema baseline

The canonical schema file is repository-root `hendy.sql`. It contains table definitions, indexes, constraints and the legacy `SPLIT_STR` stored function, but no `INSERT INTO` statements.

The dump does not create/select a database. Create a fresh database and select it in the MySQL/MariaDB client before importing. Import static game metadata separately from `database/seeds/game-static-data.sql`.