package com.therapy.management.models;

import java.time.LocalDateTime;

public class SessionNote {
    private String id;
    private String therapistId; // Reference to the therapist
    private LocalDateTime dateTime; // The date and time of the session
    private String note; // The content of the session note

    // Constructor
    public SessionNote(String id, String therapistId, LocalDateTime dateTime, String note) {
        this.id = id;
        this.therapistId = therapistId;
        this.dateTime = dateTime;
        this.note = note;
    }

    // Getters and Setters
    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTherapistId() {
        return therapistId;
    }

    public void setTherapistId(String therapistId) {
        this.therapistId = therapistId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "SessionNote{" +
                "id='" + id + '\'' +
                ", therapistId='" + therapistId + '\'' +
                ", dateTime=" + dateTime +
                ", note='" + note + '\'' +
                '}';
    }
}
