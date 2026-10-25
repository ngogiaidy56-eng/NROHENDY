package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class DhvtTemplateRow {
    public static final String TABLE_NAME = "dhvt_template";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_CUP = "cup";
    public static final String COLUMN_TIME = "time";
    public static final String COLUMN_GEM = "gem";
    public static final String COLUMN_GOLD = "gold";
    public static final String COLUMN_MIN_START = "min_start";
    public static final String COLUMN_MIN_LIMIT = "min_limit";

    private Integer id;
    private String cup;
    private String time;
    private Integer gem;
    private Integer gold;
    private Integer minStart;
    private Integer minLimit;

    public DhvtTemplateRow() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCup() {
        return this.cup;
    }

    public void setCup(String cup) {
        this.cup = cup;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getGem() {
        return this.gem;
    }

    public void setGem(Integer gem) {
        this.gem = gem;
    }

    public Integer getGold() {
        return this.gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getMinStart() {
        return this.minStart;
    }

    public void setMinStart(Integer minStart) {
        this.minStart = minStart;
    }

    public Integer getMinLimit() {
        return this.minLimit;
    }

    public void setMinLimit(Integer minLimit) {
        this.minLimit = minLimit;
    }
}
