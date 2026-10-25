package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class ShopSql {
    public static final String TABLE_NAME = "shop";
    public static final String COLUMNS = "`id`, `npc_id`, `tag_name`, `type_shop`";
    public static final String SELECT_ALL = "SELECT `id`, `npc_id`, `tag_name`, `type_shop` FROM `shop`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `shop`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `npc_id`, `tag_name`, `type_shop` FROM `shop` WHERE `id` = ?";

    private ShopSql() {
    }
}
