package com.example.keepit.listeners;

import com.example.keepit.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}