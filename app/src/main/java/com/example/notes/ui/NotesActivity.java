package com.example.notes.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.notes.R;

import java.util.Date;

public class NotesActivity extends AppCompatActivity implements NotesView {

    private NotesPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        presenter = new NotesPresenter(this);
    }

    @Override
    public void showName(String name) {

    }

    @Override
    public void showDescription(String description) {

    }

    @Override
    public void showDate(Date date) {

    }
}