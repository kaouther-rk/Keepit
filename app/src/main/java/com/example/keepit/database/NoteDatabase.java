package com.example.keepit.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.keepit.dao.NoteDao;
import com.example.keepit.entities.Note;

@Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class NoteDatabase extends RoomDatabase {

    private static NoteDatabase noteDatabase;

    public static synchronized NoteDatabase getNoteDatabase(Context context) {
        if (noteDatabase == null) {
            noteDatabase = Room.databaseBuilder(
                    context.getApplicationContext(),
                    NoteDatabase.class,
                    "notes_db"
            ).fallbackToDestructiveMigration().build();
        }
        return noteDatabase;
    }

    public abstract NoteDao noteDao();
}
