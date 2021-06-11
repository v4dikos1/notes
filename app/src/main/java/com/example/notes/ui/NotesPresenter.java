package com.example.notes.ui;

import com.example.notes.domain.INotesRepository;
import com.example.notes.domain.Notes;
import com.example.notes.domain.NotesRepository;

import java.util.List;

public class NotesPresenter {
    private NotesView view;
    private INotesRepository notesList;

    public NotesPresenter(NotesView view) {
        this.view = view;
    }

    public NotesPresenter() {
        this.view = null;
    }

    public List<Notes> getNotesList() {
        notesList = new NotesRepository();
        return notesList.getNotes();
    }


}
