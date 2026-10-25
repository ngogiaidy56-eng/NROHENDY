package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class TabShopRow {
    public static final String TABLE_NAME = "tab_shop";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_SHOP_ID = "shop_id";
    public static final String COLUMN_NAME = "NAME";

    private Integer id;
    private Integer shopId;
    private String name;

    public TabShopRow() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
