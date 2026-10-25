package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class ItemShopOptionRow {
    public static final String TABLE_NAME = "item_shop_option";
    public static final String COLUMN_ITEM_SHOP_ID = "item_shop_id";
    public static final String COLUMN_OPTION_ID = "option_id";
    public static final String COLUMN_PARAM = "param";

    private Integer itemShopId;
    private Integer optionId;
    private Integer param;

    public ItemShopOptionRow() {
    }

    public Integer getItemShopId() {
        return this.itemShopId;
    }

    public void setItemShopId(Integer itemShopId) {
        this.itemShopId = itemShopId;
    }

    public Integer getOptionId() {
        return this.optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public Integer getParam() {
        return this.param;
    }

    public void setParam(Integer param) {
        this.param = param;
    }
}
