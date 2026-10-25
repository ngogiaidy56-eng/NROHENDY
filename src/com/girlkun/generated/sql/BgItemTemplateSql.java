package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class BgItemTemplateSql {
    public static final String TABLE_NAME = "bg_item_template";
    public static final String COLUMNS = "`id`, `image_id`, `layer`, `dx`, `dy`";
    public static final String SELECT_ALL = "SELECT `id`, `image_id`, `layer`, `dx`, `dy` FROM `bg_item_template`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `bg_item_template`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `image_id`, `layer`, `dx`, `dy` FROM `bg_item_template` WHERE `id` = ?";

    private BgItemTemplateSql() {
    }
}
