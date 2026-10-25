package com.girlkun.generated.sql;

/** Generated SQL constants from hendy.sql; no DB operations are performed here. DO NOT EDIT. */
public final class PostQuestionSql {
    public static final String TABLE_NAME = "post_question";
    public static final String COLUMNS = "`question_id`, `title`, `content`, `created`, `STATUS`, `account_id`";
    public static final String SELECT_ALL = "SELECT `question_id`, `title`, `content`, `created`, `STATUS`, `account_id` FROM `post_question`";
    public static final String COUNT_ALL = "SELECT COUNT(*) FROM `post_question`";
    public static final String PRIMARY_KEY_COLUMNS = "question_id";
    public static final String SELECT_BY_PRIMARY_KEY = "SELECT `question_id`, `title`, `content`, `created`, `STATUS`, `account_id` FROM `post_question` WHERE `question_id` = ?";

    private PostQuestionSql() {
    }
}
