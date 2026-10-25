package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class ClanSv1Row {
    public static final String TABLE_NAME = "clan_sv1";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "NAME";
    public static final String COLUMN_SLOGAN = "slogan";
    public static final String COLUMN_IMG_ID = "img_id";
    public static final String COLUMN_POWER_POINT = "power_point";
    public static final String COLUMN_MAX_MEMBER = "max_member";
    public static final String COLUMN_CLAN_POINT = "clan_point";
    public static final String COLUMN_LEVEL = "LEVEL";
    public static final String COLUMN_MEMBERS = "members";
    public static final String COLUMN_CREATE_TIME = "create_time";

    private Integer id;
    private String name;
    private String slogan;
    private Integer imgId;
    private Long powerPoint;
    private Short maxMember;
    private Integer clanPoint;
    private Integer level;
    private String members;
    private java.sql.Timestamp createTime;

    public ClanSv1Row() {
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

    public String getSlogan() {
        return this.slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public Integer getImgId() {
        return this.imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Long getPowerPoint() {
        return this.powerPoint;
    }

    public void setPowerPoint(Long powerPoint) {
        this.powerPoint = powerPoint;
    }

    public Short getMaxMember() {
        return this.maxMember;
    }

    public void setMaxMember(Short maxMember) {
        this.maxMember = maxMember;
    }

    public Integer getClanPoint() {
        return this.clanPoint;
    }

    public void setClanPoint(Integer clanPoint) {
        this.clanPoint = clanPoint;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getMembers() {
        return this.members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public java.sql.Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.sql.Timestamp createTime) {
        this.createTime = createTime;
    }
}
