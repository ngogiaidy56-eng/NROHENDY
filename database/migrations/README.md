# Database migrations

Use ordered, reviewed files such as `V001__add_audit_metadata.sql`. Do not use the full legacy dump as a migration.

For every migration:
1. State the expected prior schema version.
2. Check duplicates/nulls before adding keys or constraints.
3. Test against a disposable copy and measure lock duration.
4. Back up production and rehearse restoration.
5. Coordinate changes with Java DAO/query code.
6. Record rollback steps. Do not put player-data exports or secrets here.