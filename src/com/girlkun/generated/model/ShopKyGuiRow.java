package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class ShopKyGuiRow {
    public static final String TABLE_NAME = "shop_ky_gui";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_PLAYER_ID = "player_id";
    public static final String COLUMN_TAB = "tab";
    public static final String COLUMN_ITEM_ID = "item_id";
    public static final String COLUMN_GOLD = "gold";
    public static final String COLUMN_GEM = "gem";
    public static final String COLUMN_QUANTITY = "quantity";
    public static final String COLUMN_ITEM_OPTION = "itemOption";
    public static final String COLUMN_IS_UP_TOP = "isUpTop";
    public static final String COLUMN_IS_BUY = "isBuy";

    private Integer id;
    private Integer playerId;
    private Integer tab;
    private Integer itemId;
    private Integer gold;
    private Integer gem;
    private Integer quantity;
    private String itemOption;
    private Integer isUpTop;
    private Integer isBuy;

    public ShopKyGuiRow() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlayerId() {
        return this.playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getTab() {
        return this.tab;
    }

    public void setTab(Integer tab) {
        this.tab = tab;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getGold() {
        return this.gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getGem() {
        return this.gem;
    }

    public void setGem(Integer gem) {
        this.gem = gem;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getItemOption() {
        return this.itemOption;
    }

    public void setItemOption(String itemOption) {
        this.itemOption = itemOption;
    }

    public Integer getIsUpTop() {
        return this.isUpTop;
    }

    public void setIsUpTop(Integer isUpTop) {
        this.isUpTop = isUpTop;
    }

    public Integer getIsBuy() {
        return this.isBuy;
    }

    public void setIsBuy(Integer isBuy) {
        this.isBuy = isBuy;
    }
}
