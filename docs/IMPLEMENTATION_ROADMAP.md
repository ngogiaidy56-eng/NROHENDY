# Implementation roadmap

## Phase 1 — Reproducible build
- Record Java version, dependency versions and current classpath.
- Build from a clean checkout with Ant and verify the JAR manifest Main-Class.
- Keep build output, secrets and player data out of Git.

## Phase 2 — Configuration and data
- Separate local/staging/production configuration and validate config at startup.
- Review schema in `hendy.sql`; keep schema changes in versioned migrations.
- Validate map/mob/item assets at startup and identify bad files or IDs in errors.

## Phase 3 — Network and accounts
- Verify protocol/opcodes against the authorized client and document version compatibility.
- Limit packet size, read timeout, connection count, request frequency and login attempts.
- Never log passwords or session tokens; use an appropriate password hash if the system stores passwords.
- Authenticate admin actions server-side and create audit logs.

## Phase 4 — Gameplay integrity
- Keep currency, items, damage and position authoritative on the server.
- Make asset transactions atomic and protect against replayed requests.
- Test map boundaries, character states, DB rollback and reconnect handling.

## Phase 5 — Operations
- Run controlled load tests; monitor CPU, heap, GC, sessions and DB latency.
- Schedule encrypted backups and rehearse restoration.
- Open only required game ports; keep database access on a private network.
- Write runbooks for crashes, DB outages, disk pressure and release rollback.