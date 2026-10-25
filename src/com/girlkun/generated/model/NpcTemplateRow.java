package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class NpcTemplateRow {
    public static final String TABLE_NAME = "npc_template";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "NAME";
    public static final String COLUMN_HEAD = "head";
    public static final String COLUMN_BODY = "body";
    public static final String COLUMN_LEG = "leg";
    public static final String COLUMN_AVATAR = "avatar";

    private Integer id;
    private String name;
    private Integer head;
    private Integer body;
    private Integer leg;
    private Integer avatar;

    public NpcTemplateRow() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getAvatar() {
        return this.avatar;
    }

    public void setAvatar(Integer avatar) {
        this.avatar = avatar;
    }
}
