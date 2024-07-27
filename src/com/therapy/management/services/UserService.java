package com.therapy.management.services;

import com.therapy.management.models.Therapist;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<Therapist> therapists = new ArrayList<>();

    // Add a therapist
    public void addTherapist(Therapist therapist) {
        therapists.add(therapist);
    }

    // Find a therapist by ID
    public Therapist findTherapistById(String id) {
        return therapists.stream()
                .filter(therapist -> therapist.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Update a therapist's information
    public void updateTherapist(Therapist therapist) {
        // Find and update the therapist
    }

    // Delete a therapist
    public void deleteTherapist(String id) {
        therapists.removeIf(therapist -> therapist.getId().equals(id));
    }
}
