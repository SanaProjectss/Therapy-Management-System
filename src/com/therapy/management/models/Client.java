package com.therapy.management.models;

public class Client extends User {
    private String medicalHistory; // Record of the client's medical background

    // Constructor to initialize the Client object
    public Client(String id, String name, String email, String medicalHistory) {
        super(id, name, email);
        this.medicalHistory = medicalHistory;
    }

    // Getter and setter for medicalHistory
    public String getMedicalHistory() {

        return medicalHistory;
    }
    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }

}

