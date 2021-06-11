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
        result.add(new Notes("Заметка 4", "Описание заметки 4", new Date()));
        result.add(new Notes("Заметка 5", "Описание заметки 5", new Date()));
        result.add(new Notes("Заметка 6", "Описание заметки 6", new Date()));
        result.add(new Notes("Заметка 7", "Описание заметки 7", new Date()));
        result.add(new Notes("Заметка 8", "Описание заметки 8", new Date()));
        result.add(new Notes("Заметка 9", "Описание заметки 9", new Date()));
        result.add(new Notes("Заметка 10", "Описание заметки 10", new Date()));

        return result;
    }
}
