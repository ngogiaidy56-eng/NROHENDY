package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class NpcTemplateSql {
    public static final String TABLE_NAME = "npc_template";
    public static final String COLUMNS = "`id`, `NAME`, `head`, `body`, `leg`, `avatar`";
    public static final String SELECT_ALL = "SELECT `id`, `NAME`, `head`, `body`, `leg`, `avatar` FROM `npc_template`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `npc_template`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `NAME`, `head`, `body`, `leg`, `avatar` FROM `npc_template` WHERE `id` = ?";

    private NpcTemplateSql() {
    }
}
