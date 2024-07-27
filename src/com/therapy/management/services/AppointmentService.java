package com.therapy.management.services;

import com.therapy.management.models.Appointment;

import java.util.ArrayList;
import java.util.List;

public class AppointmentService {
    private List<Appointment> appointments = new ArrayList<>();

    // Schedule an appointment
    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);

    }

    // Find appointments by therapist ID
   /* public List<Appointment> findAppointmentsByTherapistId(String therapistId) {
        // Filter and return appointments for a specific therapist
    }*/

    // Cancel an appointment
    public void cancelAppointment(String appointmentId) {
        // Find and remove the appointment
    }
}
