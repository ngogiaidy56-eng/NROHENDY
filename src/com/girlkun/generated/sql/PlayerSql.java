package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class PlayerSql {
    public static final String TABLE_NAME = "player";
    public static final String COLUMNS = "`id`, `account_id`, `name`, `head`, `gender`, `have_tennis_space_ship`, `clan_id_sv1`, `clan_id_sv2`, `data_inventory`, `data_location`, `data_point`, `data_magic_tree`, `items_body`, `items_bag`, `items_box`, `items_box_lucky_round`, `friends`, `enemies`, `data_intrinsic`, `data_item_time`, `data_item_time_sieu_cap`, `data_task`, `data_mabu_egg`, `data_charm`, `skills`, `skills_shortcut`, `pet`, `data_black_ball`, `data_side_task`, `create_time`, `violate`, `pointPvp`, `NguHanhSonPoint`, `data_card`, `bill_data`, `dataArchiverment`";
    public static final String SELECT_ALL = "SELECT `id`, `account_id`, `name`, `head`, `gender`, `have_tennis_space_ship`, `clan_id_sv1`, `clan_id_sv2`, `data_inventory`, `data_location`, `data_point`, `data_magic_tree`, `items_body`, `items_bag`, `items_box`, `items_box_lucky_round`, `friends`, `enemies`, `data_intrinsic`, `data_item_time`, `data_item_time_sieu_cap`, `data_task`, `data_mabu_egg`, `data_charm`, `skills`, `skills_shortcut`, `pet`, `data_black_ball`, `data_side_task`, `create_time`, `violate`, `pointPvp`, `NguHanhSonPoint`, `data_card`, `bill_data`, `dataArchiverment` FROM `player`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `player`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `account_id`, `name`, `head`, `gender`, `have_tennis_space_ship`, `clan_id_sv1`, `clan_id_sv2`, `data_inventory`, `data_location`, `data_point`, `data_magic_tree`, `items_body`, `items_bag`, `items_box`, `items_box_lucky_round`, `friends`, `enemies`, `data_intrinsic`, `data_item_time`, `data_item_time_sieu_cap`, `data_task`, `data_mabu_egg`, `data_charm`, `skills`, `skills_shortcut`, `pet`, `data_black_ball`, `data_side_task`, `create_time`, `violate`, `pointPvp`, `NguHanhSonPoint`, `data_card`, `bill_data`, `dataArchiverment` FROM `player` WHERE `id` = ?";

    private PlayerSql() {
    }
}
