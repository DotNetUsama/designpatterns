package com.designpattern.templatemethod;

public abstract class Appointment {

    public final void registerClient(){
        System.out.println("The client have been registered successfully. ");
    }

    public abstract void askForAppointment();

    public final void checkForAvailableTime(){
        System.out.println("Checking for available time...");
    }

    public final void confirm(){
        System.out.println("The appointment was created successfully.\n");
    }

    public final void AppointmentProcess(){
        registerClient();
        askForAppointment();
        checkForAvailableTime();
        confirm();
    }
}
