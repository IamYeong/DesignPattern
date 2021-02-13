package com.todaylunch.testproject;

public class MementoableArticle {

    private final long id;
    private final String title;
    private final String content;

    public MementoableArticle(long id, String title, String content) {

        this.id = id;
        this.title = title;
        this.content = content;

    }

    public long getMementoId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
