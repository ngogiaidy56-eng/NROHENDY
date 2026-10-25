package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class ItemShopSql {
    public static final String TABLE_NAME = "item_shop";
    public static final String COLUMNS = "`id`, `tab_id`, `temp_id`, `is_new`, `is_sell`, `type_sell`, `cost`, `icon_spec`, `create_time`";
    public static final String SELECT_ALL = "SELECT `id`, `tab_id`, `temp_id`, `is_new`, `is_sell`, `type_sell`, `cost`, `icon_spec`, `create_time` FROM `item_shop`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `item_shop`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `tab_id`, `temp_id`, `is_new`, `is_sell`, `type_sell`, `cost`, `icon_spec`, `create_time` FROM `item_shop` WHERE `id` = ?";

    private ItemShopSql() {
    }
}
