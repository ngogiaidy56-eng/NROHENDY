package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class CommentRow {
    public static final String TABLE_NAME = "comment";
    public static final String COLUMN_COMMENT_ID = "comment_id";
    public static final String COLUMN_QUESTION_ID = "question_id";
    public static final String COLUMN_CONTENT = "content";
    public static final String COLUMN_CREATED = "created";

    private Long commentId;
    private Long questionId;
    private String content;
    private java.sql.Timestamp created;

    public CommentRow() {
    }

    public Long getCommentId() {
        return this.commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getQuestionId() {
        return this.questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public java.sql.Timestamp getCreated() {
        return this.created;
    }

    public void setCreated(java.sql.Timestamp created) {
        this.created = created;
    }
}
