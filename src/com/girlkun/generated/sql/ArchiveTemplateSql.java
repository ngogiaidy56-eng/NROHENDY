package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class ArchiveTemplateSql {
    public static final String TABLE_NAME = "archive_template";
    public static final String COLUMNS = "`id`, `info1`, `info2`, `money`";
    public static final String SELECT_ALL = "SELECT `id`, `info1`, `info2`, `money` FROM `archive_template`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `archive_template`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `info1`, `info2`, `money` FROM `archive_template` WHERE `id` = ?";

    private ArchiveTemplateSql() {
    }
}
