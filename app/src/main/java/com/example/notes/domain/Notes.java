package com.example.notes.domain;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class Notes implements INotes, Parcelable {

    private String title;
    private String description;
    private Date date;

    public Notes(String title, String description, Date date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    protected Notes(Parcel in) {
        title = in.readString();
        description = in.readString();
    }

    public static final Creator<Notes> CREATOR = new Creator<Notes>() {
        @Override
        public Notes createFromParcel(Parcel in) {
            return new Notes(in);
        }

        @Override
        public Notes[] newArray(int size) {
            return new Notes[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(description);
    }
}
