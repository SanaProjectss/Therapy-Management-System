
package com.therapy.management.models;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Create a Therapist object (example)
        Therapist therapist = new Therapist("1", "Dr.Kazemian", "Hessam@gmail.com", "psycoanalytic");
        Client client=new Client("2","Sana","s.heidari7@yahoo.com","cbt");

        LocalDateTime dateTime = LocalDateTime.of(2024, 7, 24, 10, 0);


        // Create a unique ID for the appointment
        String appointmentId = "A001";

        // Create an Appointment object
        Appointment appointment = new Appointment(dateTime,client ,therapist);


        // Print the appointment details
        System.out.println(appointment.toString());
    }
}
