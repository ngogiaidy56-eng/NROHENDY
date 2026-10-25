package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class RadarRow {
    public static final String TABLE_NAME = "radar";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_ICON_ID = "iconId";
    public static final String COLUMN_RANK = "rank";
    public static final String COLUMN_MAX = "max";
    public static final String COLUMN_TYPE = "type";
    public static final String COLUMN_TEMPLATE = "template";
    public static final String COLUMN_BODY = "body";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_INFO = "info";
    public static final String COLUMN_OPTIONS = "options";
    public static final String COLUMN_REQUIRE = "require";
    public static final String COLUMN_REQUIRE_LEVEL = "require_level";
    public static final String COLUMN_AURA_ID = "aura_id";

    private Integer id;
    private Integer iconId;
    private Byte rank;
    private Integer max;
    private Integer type;
    private Integer template;
    private String body;
    private String name;
    private String info;
    private String options;
    private Integer require;
    private Integer requireLevel;
    private Short auraId;

    public RadarRow() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIconId() {
        return this.iconId;
    }

    public void setIconId(Integer iconId) {
        this.iconId = iconId;
    }

    public Byte getRank() {
        return this.rank;
    }

    public void setRank(Byte rank) {
        this.rank = rank;
    }

    public Integer getMax() {
        return this.max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTemplate() {
        return this.template;
    }

    public void setTemplate(Integer template) {
        this.template = template;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getOptions() {
        return this.options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public Integer getRequire() {
        return this.require;
    }

    public void setRequire(Integer require) {
        this.require = require;
    }

    public Integer getRequireLevel() {
        return this.requireLevel;
    }

    public void setRequireLevel(Integer requireLevel) {
        this.requireLevel = requireLevel;
    }

    public Short getAuraId() {
        return this.auraId;
    }

    public void setAuraId(Short auraId) {
        this.auraId = auraId;
    }
}
