# Test layout

- `unit/`: combat formulas, inventory invariants, movement and permission rules.
- `integration/`: DAO operations, transaction rollback, reconnect and persistence.
- `network/`: valid/invalid packets, oversized frames, timeouts and cleanup.
- `load/`: controlled load tests in isolated environments only.

The legacy project may not have JUnit configured. Add a test framework and Ant targets only after checking the source JDK and build file; empty directories are not passing tests.