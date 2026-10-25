# Security checklist before public launch

- [ ] No real passwords/API keys in Git, JARs, logs or example configs.
- [ ] Database is not public-facing; DB account follows least privilege.
- [ ] SQL uses prepared statements and external input is validated.
- [ ] Packets have size limits, read timeouts and rate limits.
- [ ] Failed sessions close safely; sockets and threads are cleaned up.
- [ ] Currency/items use transactions and duplicate-operation protection.
- [ ] Admin commands have RBAC, authentication, audit trail and network restrictions.
- [ ] Logs never include credentials/tokens and log access is restricted.
- [ ] Backups are encrypted and restoration has been tested.
- [ ] Dependencies are reviewed and updated through a controlled process.
- [ ] Rights to code, sprites, maps, audio and client/protocol use are checked before publishing.