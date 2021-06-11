package com.example.notes.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotesRepository implements INotesRepository {

    public List<Notes> getNotes() {
        ArrayList<Notes> result = new ArrayList<Notes>();

        result.add(new Notes("Заметка 1", "Описание заметки 1", new Date()));
        result.add(new Notes("Заметка 2", "Описание заметки 2", new Date()));
        result.add(new Notes("Заметка 3", "Описание заметки 3", new Date()));

        return result;
    }
}
