package com.therapy.management.models;

import java.util.ArrayList;
import java.util.List;

public class Therapist extends User {
    private String specialization; // Area of expertise for the therapist
    private List<Appointment> availability; // List of available appointment slots

    // Constructor to initialize the Therapist object
    public Therapist(String id, String name, String email, String specialization) {
        super(id, name, email);
        this.specialization = specialization;
        this.availability = new ArrayList<>();
    }

    // Getter and setter for specialization
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Getter and setter for availability
    public List<Appointment> getAvailability() {
        return availability;
    }
    public void addAvailability(Appointment appointment) {
        this.availability.add(appointment);
    }
    public void removeAvailability(Appointment appointment) {
        this.availability.remove(appointment);
    }


    @Override
    public String toString() {
        return "Therapist{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", speciaization='" + specialization + '\'' +
                '}';
    }



}
