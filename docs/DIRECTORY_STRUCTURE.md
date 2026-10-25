# NROHENDY proposed directory structure

Keep the existing Java class/package names until compatibility is verified. The folders below are additive organization; they do not imply that gameplay implementations already exist.

```text
NROHENDY/
├── .github/workflows/          CI build and test checks
├── src/com/girlkun/
│   ├── card/ clan/ consts/ database/ io/ jdbc/ kygui/
│   ├── models/{boss,item,map,mob,player,skill}/
│   ├── network/{codec,handlers,protocol,security,session,transport}/
│   ├── server/{config,health,lifecycle}/
│   ├── services/{account,auth,combat,event,inventory,item,movement,notification,party,quest,ranking,shop,skill,trade,world}/
│   ├── admin/{audit,commands,permissions}/
│   ├── scheduler/ observability/ utils/ result/
├── data/config/                example files only in Git
├── data/girlkun/               existing game assets
├── database/{docs,migrations,seeds}/
├── docs/{api,architecture,runbooks,security}/
├── ops/{docker,monitoring,reverse-proxy,systemd}/
├── scripts/
├── test/{integration,load,network,resources,unit}/
└── tools/{data-validator,protocol-inspector}/
```

## Responsibilities
- `network/`: transport, framing, encoding, protocol versions, session lifecycle, validation and rate limits.
- `services/`: account/auth, world/map, movement, combat, inventory/item, quest, party, trade, shop, ranking and events.
- `admin/`: privileged commands, RBAC checks and audit events.
- `jdbc/daos` and `database/`: persistence and versioned schema updates.
- `observability/`, `scheduler/`: metrics/logging and safe periodic tasks.
- `test/`: unit, integration, network protocol and controlled load tests.
- `ops/`: example service/container/proxy configs; review before use.