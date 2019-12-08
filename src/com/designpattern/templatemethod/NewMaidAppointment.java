package com.designpattern.templatemethod;

public class NewMaidAppointment extends Appointment {

    @Override
    public void askForAppointment() {
        System.out.println("Your request for an appointment has been registered for a new maid.");
    }
}
