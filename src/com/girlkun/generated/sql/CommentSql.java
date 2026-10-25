package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class CommentSql {
    public static final String TABLE_NAME = "comment";
    public static final String COLUMNS = "`comment_id`, `question_id`, `content`, `created`";
    public static final String SELECT_ALL = "SELECT `comment_id`, `question_id`, `content`, `created` FROM `comment`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `comment`";
    public static final String PRIMARY_KEY_COLUMNS = "comment_id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `comment_id`, `question_id`, `content`, `created` FROM `comment` WHERE `comment_id` = ?";

    private CommentSql() {
    }
}
