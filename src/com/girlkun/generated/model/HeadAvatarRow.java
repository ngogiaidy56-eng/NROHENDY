package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class HeadAvatarRow {
    public static final String TABLE_NAME = "head_avatar";
    public static final String COLUMN_HEAD_ID = "head_id";
    public static final String COLUMN_AVATAR_ID = "avatar_id";

    private Integer headId;
    private Integer avatarId;

    public HeadAvatarRow() {
    }

    public Integer getHeadId() {
        return this.headId;
    }

    public void setHeadId(Integer headId) {
        this.headId = headId;
    }

    public Integer getAvatarId() {
        return this.avatarId;
    }

    public void setAvatarId(Integer avatarId) {
        this.avatarId = avatarId;
    }
}
