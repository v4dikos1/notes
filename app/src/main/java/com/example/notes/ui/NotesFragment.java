package com.example.notes.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.notes.R;
import com.example.notes.domain.Notes;

import java.util.List;

public class NotesFragment extends Fragment {

    private NotesPresenter presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = new NotesPresenter();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_notes, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayout notesContainer = view.findViewById(R.id.notes_container);

        List<Notes> notesList = presenter.getNotesList();

        for (Notes note : notesList) {

            View itemView = LayoutInflater.from(requireContext()).inflate(R.layout.item_note,
                    notesContainer, false);

            TextView title = itemView.findViewById(R.id.title);
            title.setText(note.getTitle());

            TextView date = itemView.findViewById(R.id.date);
            date.setText(note.getDate().toString());

        }
    }


}
