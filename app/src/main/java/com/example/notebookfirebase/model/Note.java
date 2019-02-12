package com.example.notebookfirebase.model;

public class Note {
    private String title;
    private String description;
    private long unixTime;

    public Note() {
        //No args constructor needed
    }

    public Note(String title, String description) {
        this.title = title;
        this.description = description;
        this.unixTime = System.currentTimeMillis();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getUnixTime() {
        return unixTime;
    }

    public void setUnixTime(long unixTime) {
        this.unixTime = unixTime;
    }
}
