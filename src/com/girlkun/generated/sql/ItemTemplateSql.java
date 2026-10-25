package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class ItemTemplateSql {
    public static final String TABLE_NAME = "item_template";
    public static final String COLUMNS = "`id`, `TYPE`, `gender`, `NAME`, `description`, `icon_id`, `part`, `is_up_to_up`, `power_require`, `gold`, `gem`, `head`, `body`, `leg`";
    public static final String SELECT_ALL = "SELECT `id`, `TYPE`, `gender`, `NAME`, `description`, `icon_id`, `part`, `is_up_to_up`, `power_require`, `gold`, `gem`, `head`, `body`, `leg` FROM `item_template`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `item_template`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `TYPE`, `gender`, `NAME`, `description`, `icon_id`, `part`, `is_up_to_up`, `power_require`, `gold`, `gem`, `head`, `body`, `leg` FROM `item_template` WHERE `id` = ?";

    private ItemTemplateSql() {
    }
}
