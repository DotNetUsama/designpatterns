package com.designpattern.templatemethod;

public class ReturnMaidAppointment extends Appointment {

    @Override
    public void askForAppointment() {
        System.out.println("Your request for an appointment has been registered for return a maid.");
    }
}
