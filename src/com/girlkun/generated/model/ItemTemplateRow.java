package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class ItemTemplateRow {
    public static final String TABLE_NAME = "item_template";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_TYPE = "TYPE";
    public static final String COLUMN_GENDER = "gender";
    public static final String COLUMN_NAME = "NAME";
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String COLUMN_ICON_ID = "icon_id";
    public static final String COLUMN_PART = "part";
    public static final String COLUMN_IS_UP_TO_UP = "is_up_to_up";
    public static final String COLUMN_POWER_REQUIRE = "power_require";
    public static final String COLUMN_GOLD = "gold";
    public static final String COLUMN_GEM = "gem";
    public static final String COLUMN_HEAD = "head";
    public static final String COLUMN_BODY = "body";
    public static final String COLUMN_LEG = "leg";

    private Integer id;
    private Integer type;
    private Short gender;
    private String name;
    private String description;
    private Integer iconId;
    private Integer part;
    private Boolean isUpToUp;
    private Integer powerRequire;
    private Integer gold;
    private Integer gem;
    private Integer head;
    private Integer body;
    private Integer leg;

    public ItemTemplateRow() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Short getGender() {
        return this.gender;
    }

    public void setGender(Short gender) {
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIconId() {
        return this.iconId;
    }

    public void setIconId(Integer iconId) {
        this.iconId = iconId;
    }

    public Integer getPart() {
        return this.part;
    }

    public void setPart(Integer part) {
        this.part = part;
    }

    public Boolean getIsUpToUp() {
        return this.isUpToUp;
    }

    public void setIsUpToUp(Boolean isUpToUp) {
        this.isUpToUp = isUpToUp;
    }

    public Integer getPowerRequire() {
        return this.powerRequire;
    }

    public void setPowerRequire(Integer powerRequire) {
        this.powerRequire = powerRequire;
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

    public Integer getHead() {
        return this.head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

    public Integer getBody() {
        return this.body;
    }

    public void setBody(Integer body) {
        this.body = body;
    }

    public Integer getLeg() {
        return this.leg;
    }

    public void setLeg(Integer leg) {
        this.leg = leg;
    }
}
