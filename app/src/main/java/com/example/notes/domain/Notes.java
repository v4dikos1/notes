package com.example.notes.domain;

import java.util.Date;

public class Notes implements INotes {

    private String title;
    private String description;
    private Date date;

    public Notes(String title, String description, Date date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
}
