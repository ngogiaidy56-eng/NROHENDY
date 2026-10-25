package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class IntrinsicSql {
    public static final String TABLE_NAME = "intrinsic";
    public static final String COLUMNS = "`id`, `NAME`, `param_from_1`, `param_to_1`, `param_from_2`, `param_to_2`, `icon`, `gender`";
    public static final String SELECT_ALL = "SELECT `id`, `NAME`, `param_from_1`, `param_to_1`, `param_from_2`, `param_to_2`, `icon`, `gender` FROM `intrinsic`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `intrinsic`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `NAME`, `param_from_1`, `param_to_1`, `param_from_2`, `param_to_2`, `icon`, `gender` FROM `intrinsic` WHERE `id` = ?";

    private IntrinsicSql() {
    }
}
