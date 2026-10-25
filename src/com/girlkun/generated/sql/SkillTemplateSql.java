package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class SkillTemplateSql {
    public static final String TABLE_NAME = "skill_template";
    public static final String COLUMNS = "`nclass_id`, `id`, `NAME`, `max_point`, `mana_use_type`, `TYPE`, `icon_id`, `dam_info`, `slot`, `skills`";
    public static final String SELECT_ALL = "SELECT `nclass_id`, `id`, `NAME`, `max_point`, `mana_use_type`, `TYPE`, `icon_id`, `dam_info`, `slot`, `skills` FROM `skill_template`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `skill_template`";
    public static final String PRIMARY_KEY_COLUMNS = "nclass_id, id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `nclass_id`, `id`, `NAME`, `max_point`, `mana_use_type`, `TYPE`, `icon_id`, `dam_info`, `slot`, `skills` FROM `skill_template` WHERE `nclass_id` = ? AND `id` = ?";

    private SkillTemplateSql() {
    }
}
