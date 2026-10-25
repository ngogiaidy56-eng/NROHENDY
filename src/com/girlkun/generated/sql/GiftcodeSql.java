package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class GiftcodeSql {
    public static final String TABLE_NAME = "giftcode";
    public static final String COLUMNS = "`id`, `code`, `count_left`, `detail`, `datecreate`, `expired`, `itemoption`, `listIdUser`";
    public static final String SELECT_ALL = "SELECT `id`, `code`, `count_left`, `detail`, `datecreate`, `expired`, `itemoption`, `listIdUser` FROM `giftcode`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `giftcode`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `code`, `count_left`, `detail`, `datecreate`, `expired`, `itemoption`, `listIdUser` FROM `giftcode` WHERE `id` = ?";

    private GiftcodeSql() {
    }
}
