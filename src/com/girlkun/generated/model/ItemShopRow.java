package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class ItemShopRow {
    public static final String TABLE_NAME = "item_shop";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_TAB_ID = "tab_id";
    public static final String COLUMN_TEMP_ID = "temp_id";
    public static final String COLUMN_IS_NEW = "is_new";
    public static final String COLUMN_IS_SELL = "is_sell";
    public static final String COLUMN_TYPE_SELL = "type_sell";
    public static final String COLUMN_COST = "cost";
    public static final String COLUMN_ICON_SPEC = "icon_spec";
    public static final String COLUMN_CREATE_TIME = "create_time";

    private Integer id;
    private Integer tabId;
    private Integer tempId;
    private Boolean isNew;
    private Boolean isSell;
    private Integer typeSell;
    private Integer cost;
    private Integer iconSpec;
    private java.sql.Timestamp createTime;

    public ItemShopRow() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTabId() {
        return this.tabId;
    }

    public void setTabId(Integer tabId) {
        this.tabId = tabId;
    }

    public Integer getTempId() {
        return this.tempId;
    }

    public void setTempId(Integer tempId) {
        this.tempId = tempId;
    }

    public Boolean getIsNew() {
        return this.isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public Boolean getIsSell() {
        return this.isSell;
    }

    public void setIsSell(Boolean isSell) {
        this.isSell = isSell;
    }

    public Integer getTypeSell() {
        return this.typeSell;
    }

    public void setTypeSell(Integer typeSell) {
        this.typeSell = typeSell;
    }

    public Integer getCost() {
        return this.cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getIconSpec() {
        return this.iconSpec;
    }

    public void setIconSpec(Integer iconSpec) {
        this.iconSpec = iconSpec;
    }

    public java.sql.Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.sql.Timestamp createTime) {
        this.createTime = createTime;
    }
}
