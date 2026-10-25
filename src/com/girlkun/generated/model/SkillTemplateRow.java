package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class SkillTemplateRow {
    public static final String TABLE_NAME = "skill_template";
    public static final String COLUMN_NCLASS_ID = "nclass_id";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "NAME";
    public static final String COLUMN_MAX_POINT = "max_point";
    public static final String COLUMN_MANA_USE_TYPE = "mana_use_type";
    public static final String COLUMN_TYPE = "TYPE";
    public static final String COLUMN_ICON_ID = "icon_id";
    public static final String COLUMN_DAM_INFO = "dam_info";
    public static final String COLUMN_SLOT = "slot";
    public static final String COLUMN_SKILLS = "skills";

    private Integer nclassId;
    private Integer id;
    private String name;
    private Short maxPoint;
    private Short manaUseType;
    private Short type;
    private Integer iconId;
    private String damInfo;
    private Integer slot;
    private String skills;

    public SkillTemplateRow() {
    }

    public Integer getNclassId() {
        return this.nclassId;
    }

    public void setNclassId(Integer nclassId) {
        this.nclassId = nclassId;
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

    public Short getMaxPoint() {
        return this.maxPoint;
    }

    public void setMaxPoint(Short maxPoint) {
        this.maxPoint = maxPoint;
    }

    public Short getManaUseType() {
        return this.manaUseType;
    }

    public void setManaUseType(Short manaUseType) {
        this.manaUseType = manaUseType;
    }

    public Short getType() {
        return this.type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Integer getIconId() {
        return this.iconId;
    }

    public void setIconId(Integer iconId) {
        this.iconId = iconId;
    }

    public String getDamInfo() {
        return this.damInfo;
    }

    public void setDamInfo(String damInfo) {
        this.damInfo = damInfo;
    }

    public Integer getSlot() {
        return this.slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public String getSkills() {
        return this.skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
