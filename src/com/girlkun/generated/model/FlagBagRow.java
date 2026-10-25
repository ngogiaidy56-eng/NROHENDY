package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class FlagBagRow {
    public static final String TABLE_NAME = "flag_bag";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_ICON_DATA = "icon_data";
    public static final String COLUMN_NAME = "NAME";
    public static final String COLUMN_GOLD = "gold";
    public static final String COLUMN_GEM = "gem";
    public static final String COLUMN_ICON_ID = "icon_id";

    private Integer id;
    private String iconData;
    private String name;
    private Integer gold;
    private Integer gem;
    private Integer iconId;

    public FlagBagRow() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIconData() {
        return this.iconData;
    }

    public void setIconData(String iconData) {
        this.iconData = iconData;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getIconId() {
        return this.iconId;
    }

    public void setIconId(Integer iconId) {
        this.iconId = iconId;
    }
}
