package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class TabShopSql {
    public static final String TABLE_NAME = "tab_shop";
    public static final String COLUMNS = "`id`, `shop_id`, `NAME`";
    public static final String SELECT_ALL = "SELECT `id`, `shop_id`, `NAME` FROM `tab_shop`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `tab_shop`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `shop_id`, `NAME` FROM `tab_shop` WHERE `id` = ?";

    private TabShopSql() {
    }
}
