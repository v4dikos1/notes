package com.example.notes.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.notes.R;
import com.example.notes.domain.Notes;

public class NotesDescriptionFragment extends Fragment {

    private static final String ARG_NOTES = "AGR_NOTES";

    public static NotesDescriptionFragment newInstance(Notes notes) {
        NotesDescriptionFragment fragment = new NotesDescriptionFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ARG_NOTES, notes);
        fragment.setArguments(bundle);
        return fragment;
    }

    public NotesDescriptionFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_notes_description, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView title = view.findViewById(R.id.title);
        TextView date = view.findViewById(R.id.date_desc);
        TextView description = view.findViewById(R.id.description);

        Notes notes = getArguments().getParcelable(ARG_NOTES);

        title.setText(notes.getTitle());
        // Почему-то notes.getDate() возвращает null
        // date.setText(notes.getDate().toString());
        description.setText(notes.getDescription());
    }
}