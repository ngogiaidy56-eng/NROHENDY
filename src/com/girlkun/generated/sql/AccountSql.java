package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class AccountSql {
    public static final String TABLE_NAME = "account";
    public static final String COLUMNS = "`id`, `username`, `password`, `create_time`, `update_time`, `ban`, `point_post`, `last_post`, `role`, `is_admin`, `last_time_login`, `last_time_logout`, `ip_address`, `active`, `thoi_vang`, `server_login`, `bd_player`, `is_gift_box`, `gift_time`, `reward`, `tongnap`, `coin`, `vnd`";
    public static final String SELECT_ALL = "SELECT `id`, `username`, `password`, `create_time`, `update_time`, `ban`, `point_post`, `last_post`, `role`, `is_admin`, `last_time_login`, `last_time_logout`, `ip_address`, `active`, `thoi_vang`, `server_login`, `bd_player`, `is_gift_box`, `gift_time`, `reward`, `tongnap`, `coin`, `vnd` FROM `account`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `account`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `username`, `password`, `create_time`, `update_time`, `ban`, `point_post`, `last_post`, `role`, `is_admin`, `last_time_login`, `last_time_logout`, `ip_address`, `active`, `thoi_vang`, `server_login`, `bd_player`, `is_gift_box`, `gift_time`, `reward`, `tongnap`, `coin`, `vnd` FROM `account` WHERE `id` = ?";

    private AccountSql() {
    }
}
