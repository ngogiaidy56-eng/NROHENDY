# NROHENDY database schema audit

## Input reviewed
Legacy `hendy.sql` in the repository (phpMyAdmin export reporting MariaDB 10.4.28, dated 2023-12-20). The dump defines **45 InnoDB tables** and a stored function named `SPLIT_STR`. Static game rows and runtime rows were mixed together in the original file.

## Changes in this repository
- Split the schema into root `hendy.sql` and `database/seeds/game-static-data.sql`.
- Kept static game templates/catalogs in the seed file.
- Removed account/password rows, player saves, guild-state rows, gift-code values and top-up/payment rows from the public data set. Their table definitions remain.
- Removed the explicit `DEFINER=`root`@`localhost`` clause from `SPLIT_STR`; importing still requires permission to create the routine.
- Added a static validation script and workflow.

**Important history note:** replacing the current file does not remove the old dump from earlier Git commits. If any account passwords, gift codes, payment identifiers or other live data were real, rotate/revoke them. Removing historical copies requires a reviewed Git history rewrite and force-push; that has not been performed automatically.

## Findings to review before production

1. **Mixed collations.** The dump mixes `latin1`, legacy `utf8` and `utf8mb4`. Normalize only after staging tests and a Java-side compatibility check.
2. **Tables without primary keys.** `card`, `history_receive_goldbar`, `history_transaction`, `part` and `task_sub_template` do not declare a primary key in the dump. Some may use legacy composite identifiers or duplicate rows intentionally; inspect real data and DAO queries before adding constraints.
3. **Redundant token index.** `token` declares two unique indexes on `account_id` with different names. Review whether one can be removed in a later migration.
4. **Gift-code uniqueness.** `giftcode.code` does not declare a unique key. Check duplicates and gameplay expectations before adding one.
5. **Payment schema typing.** `naptien` stores amount/status/transaction-related fields as text. Changing types requires checking validation logic and existing data first.
6. **Foreign-key coverage.** Explicit foreign keys exist for several related tables, but many logical relationships are not enforced. Do not add foreign keys without checking legacy rows.
7. **Database selection.** The dump does not contain `CREATE DATABASE` or `USE`. Create/select the intended database before import.

## Suggested integration sequence
1. Restore the legacy schema into an isolated MariaDB instance.
2. Import only the sanitized static seed file.
3. Add DAO-level tests for accounts, player saves, items, shops, skills and transaction flows.
4. Check the exact Java/client protocol source before writing packet handlers.
5. Develop numbered migrations for data-integrity improvements; never alter production schema directly from an unreviewed dump.