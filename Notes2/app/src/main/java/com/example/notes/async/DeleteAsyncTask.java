package com.example.notes.async;

import android.os.AsyncTask;

import com.example.notes.models.Note;
import com.example.persistance.NoteDao;

public class DeleteAsyncTask extends AsyncTask<Note, Void, Void> {
    private NoteDao mNoteDao;

    public DeleteAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.delete(notes);
        return null;
    }
}
