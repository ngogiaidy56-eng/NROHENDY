package com.girlkun.generated.model;

/** Generated from hendy.sql. DO NOT EDIT; rerun tools/sql-scaffold/generate.py. */
public class PostQuestionRow {
    public static final String TABLE_NAME = "post_question";
    public static final String COLUMN_QUESTION_ID = "question_id";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_CONTENT = "content";
    public static final String COLUMN_CREATED = "created";
    public static final String COLUMN_STATUS = "STATUS";
    public static final String COLUMN_ACCOUNT_ID = "account_id";

    private Long questionId;
    private String title;
    private String content;
    private java.sql.Timestamp created;
    private Integer status;
    private Integer accountId;

    public PostQuestionRow() {
    }

    public Long getQuestionId() {
        return this.questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
}
