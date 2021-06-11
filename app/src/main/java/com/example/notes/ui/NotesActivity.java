package com.example.notes.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.notes.R;
import com.example.notes.domain.Notes;

import java.util.Date;

public class NotesActivity extends AppCompatActivity implements NotesView, NotesFragment.OnNotesClicked {

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

    @Override
    public void onNotesClicked(Notes notes) {
        boolean isLandscape = getResources().getBoolean(R.bool.landscapeOrientation);

        if (isLandscape) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_description, NotesDescriptionFragment.newInstance(notes))
                    .commit();
        } else {

            Intent intent = new Intent(this, DescriptionActivity.class);
            intent.putExtra(DescriptionActivity.ARG_NOTES, notes);
            startActivity(intent);
        }

    }
}