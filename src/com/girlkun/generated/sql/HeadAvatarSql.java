package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class HeadAvatarSql {
    public static final String TABLE_NAME = "head_avatar";
    public static final String COLUMNS = "`head_id`, `avatar_id`";
    public static final String SELECT_ALL = "SELECT `head_id`, `avatar_id` FROM `head_avatar`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `head_avatar`";
    public static final String PRIMARY_KEY_COLUMNS = "head_id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `head_id`, `avatar_id` FROM `head_avatar` WHERE `head_id` = ?";

    private HeadAvatarSql() {
    }
}
