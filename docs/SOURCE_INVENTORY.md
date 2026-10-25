# Original runtime source still required

The repository's current `src/com/girlkun/` contains placeholder directories rather than the actual legacy Java classes. The SQL file can describe persistence tables, but it cannot reconstruct the NRO client protocol, game rules, class implementations, dependency versions or binary assets.

To complete a runnable server, integrate and review the original:
- Java files under `src/com/girlkun/` (server boot, network protocol/session, player/model/services, JDBC/DAO).
- `build.xml`, `manifest.mf`, `run.bat` and the supported JDK level.
- Required dependency JARs and licenses; do not upload generated build output or secrets.
- Actual game resources under `data/girlkun/` (map, mob, image/effect/version data).
- Any protocol/client compatibility documentation and a known-good test account created in a private development DB.

Do not fabricate packet opcodes or database columns from the schema alone. After integrating source, build in a clean checkout, run database integration tests, then test login and gameplay against the matching authorized client.
