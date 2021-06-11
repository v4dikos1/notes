package com.example.notes.domain;

import java.util.Date;

public class Notes implements INotes{

    private String title;
    private String description;
    private Date date;

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
