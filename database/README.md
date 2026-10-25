# Database schema management

- Treat legacy `hendy.sql` as a reference/import artifact until its schema has been reviewed.
- Put each new schema change in `migrations/` with an ordered name such as `V001__create_audit_log.sql`.
- Put only non-sensitive development fixtures in `seeds/`.
- Never commit production backups, player data, credentials or database dumps.
- Before migration: take a backup, test against a copy, measure locks and document restore/rollback steps.
- Do not apply empty template migrations or unreviewed SQL to a live database.