package com.therapy.management.models;

import java.time.LocalDateTime;

public class Appointment {
     LocalDateTime dateTime; // The date and time of the appointment
    private Client client; // The client who booked the appointment
    private Therapist therapist; // The therapist assigned to the appointment

    // Constructor to initialize the Appointment object
    public Appointment(LocalDateTime dateTime, Client client, Therapist therapist) {
        this.dateTime = dateTime;
        this.client = client;
        this.therapist = therapist;
    }

    // Getter and setter for dateTime
    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    // Getter and setter for client
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    // Getter and setter for therapist
    public Therapist getTherapist() {
        return therapist;
    }
    public void setTherapist(Therapist therapist) {
        this.therapist = therapist;
    }
    @Override
    public String toString() {
        return "Appointment{" +
                "dateTime=" + dateTime +
                ", client=" + client +
                ", therapist=" + therapist +
                '}';
    }


}
