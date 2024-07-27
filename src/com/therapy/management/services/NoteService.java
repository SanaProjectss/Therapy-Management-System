package com.therapy.management.services;

import com.therapy.management.models.SessionNote;

import java.util.ArrayList;
import java.util.List;

public class NoteService {
    private List<SessionNote> notes = new ArrayList<>();

    // Add a session note
    public void addSessionNote(SessionNote note) {
        notes.add(note);
    }

    // Find notes by therapist ID
   /* public List<SessionNote> findNotesByTherapistId(String therapistId) {
        // Filter and return notes for a specific therapist
    }*/

    // Update a session note
    public void updateSessionNote(SessionNote note) {
        // Find and update the note
    }

    // Delete a session note
    public void deleteSessionNote(String noteId) {
        notes.removeIf(note -> note.getId().equals(noteId));
    }
}
