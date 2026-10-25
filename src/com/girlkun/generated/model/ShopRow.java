package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class ShopRow {
    public static final String TABLE_NAME = "shop";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NPC_ID = "npc_id";
    public static final String COLUMN_TAG_NAME = "tag_name";
    public static final String COLUMN_TYPE_SHOP = "type_shop";

    private Integer id;
    private Integer npcId;
    private String tagName;
    private Integer typeShop;

    public ShopRow() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNpcId() {
        return this.npcId;
    }

    public void setNpcId(Integer npcId) {
        this.npcId = npcId;
    }

    public String getTagName() {
        return this.tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Integer getTypeShop() {
        return this.typeShop;
    }

    public void setTypeShop(Integer typeShop) {
        this.typeShop = typeShop;
    }
}
