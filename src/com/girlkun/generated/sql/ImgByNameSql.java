package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class ImgByNameSql {
    public static final String TABLE_NAME = "img_by_name";
    public static final String COLUMNS = "`id`, `NAME`, `n_frame`";
    public static final String SELECT_ALL = "SELECT `id`, `NAME`, `n_frame` FROM `img_by_name`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `img_by_name`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `NAME`, `n_frame` FROM `img_by_name` WHERE `id` = ?";

    private ImgByNameSql() {
    }
}
