package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class ShopKyGuiSql {
    public static final String TABLE_NAME = "shop_ky_gui";
    public static final String COLUMNS = "`id`, `player_id`, `tab`, `item_id`, `gold`, `gem`, `quantity`, `itemOption`, `isUpTop`, `isBuy`";
    public static final String SELECT_ALL = "SELECT `id`, `player_id`, `tab`, `item_id`, `gold`, `gem`, `quantity`, `itemOption`, `isUpTop`, `isBuy` FROM `shop_ky_gui`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `shop_ky_gui`";
    public static final String PRIMARY_KEY_COLUMNS = "id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `id`, `player_id`, `tab`, `item_id`, `gold`, `gem`, `quantity`, `itemOption`, `isUpTop`, `isBuy` FROM `shop_ky_gui` WHERE `id` = ?";

    private ShopKyGuiSql() {
    }
}
