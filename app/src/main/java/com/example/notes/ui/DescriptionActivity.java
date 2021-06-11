package com.example.notes.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.notes.R;
import com.example.notes.domain.Notes;

public class DescriptionActivity extends AppCompatActivity {

    public static final String ARG_NOTES = "ARG_NOTES";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        if (savedInstanceState == null) {

            Notes notes = getIntent().getParcelableExtra(ARG_NOTES);

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container_description, NotesDescriptionFragment.newInstance(notes))
                    .commit();
        }
    }
}