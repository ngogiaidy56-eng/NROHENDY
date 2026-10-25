package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class ClanSv2Sql {
    public static final String TABLE_NAME = "clan_sv2";
    public static final String COLUMNS = "`id`, `NAME`, `slogan`, `img_id`, `power_point`, `max_member`, `clan_point`, `LEVEL`, `members`, `create_time`";
    public static final String SELECT_ALL = "SELECT `id`, `NAME`, `slogan`, `img_id`, `power_point`, `max_member`, `clan_point`, `LEVEL`, `members`, `create_time` FROM `clan_sv2`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `clan_sv2`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `NAME`, `slogan`, `img_id`, `power_point`, `max_member`, `clan_point`, `LEVEL`, `members`, `create_time` FROM `clan_sv2` WHERE `id` = ?";

    private ClanSv2Sql() {
    }
}
