package com.todaylunch.testproject;

public class MementoArticle {

    private long id;
    private String title;
    private String content;

    public MementoArticle(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public MementoableArticle createMemento() {
        MementoableArticle m = new MementoableArticle(id, title, content);
        return m;
    }

    public void restore(MementoableArticle m) {

        this.id = m.getMementoId();
        this.title = m.getTitle();
        this.content = m.getContent();

    }

    @Override
    public String toString() {
        return "Article [" + id + ", " + title + ", " + content + "]";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
