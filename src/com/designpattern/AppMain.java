package com.designpattern;

import com.designpattern.abstractfactory.*;
import com.designpattern.adapter.CustomersDates;
import com.designpattern.adapter.DateAdapter;
import com.designpattern.adapter.SpecialDate;
import com.designpattern.decorator.*;
import com.designpattern.strategy.NotificationStrategy;
import com.designpattern.strategy.RememberDateContext;
import com.designpattern.strategy.RememberDateStrategy;
import com.designpattern.templatemethod.Appointment;
import com.designpattern.templatemethod.ComplaintAppointment;
import com.designpattern.templatemethod.NewMaidAppointment;
import com.designpattern.templatemethod.ReturnMaidAppointment;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) throws ParseException {
        //-------------------------(Abstract Factory)-------------------------
        System.out.println("[*] Order maid using Abstract Factory...");
        Maid kitchenMaid = new Maid("Samara", 30);
        Maid houseMaid = new Maid("Hiba", 24);

        KitchenMaidBuildingClient kitchenMaidBuildingClient = new KitchenMaidBuildingClient();
        kitchenMaidBuildingClient.orderKitchenMaid("Filipion" , kitchenMaid);

        HouseMaidBuildingClient houseMaidBuildingClient = new HouseMaidBuildingClient();
        houseMaidBuildingClient.orderhouseMaid("Sri lankan", houseMaid);
        //--------------------------------------------------------------------

        //-------------------------(Adapter)-------------------------
        System.out.println("[*] Sort customers dates using Adapter... ");
        List<SpecialDate> unsortedList = new ArrayList<>();
        unsortedList.add(new SpecialDate("5","July","2010"));
        unsortedList.add(new SpecialDate("6","April","2010"));
        unsortedList.add(new SpecialDate("2","January","2010"));
        unsortedList.add(new SpecialDate("23","November","2010"));
        unsortedList.add(new SpecialDate("11","March","2010"));

        CustomersDates customerDate = new DateAdapter();
        customerDate.orderDates(unsortedList);
        //-----------------------------------------------------------

        //-------------------------(Strategy)-------------------------
        System.out.println("[*] Remember the appointment date using Strategy... ");
        RememberDateContext rememberDateContext = new RememberDateContext();
        RememberDateStrategy rememberDateStrategy = new NotificationStrategy();

        rememberDateContext.setRememberDateStrategy(rememberDateStrategy);
        String selectedStrategy = rememberDateContext.apply();
        System.out.println(selectedStrategy +"\n");
        //-----------------------------------------------------------

        //-------------------------(Decorator)-------------------------
        System.out.println("[*] Remember the appointment date using Decorator... ");
        PlainNotification notification = new PlainNotification();
        System.out.println("VOICE ALARM:");
        VoiceAlarmDecorator voiceAlarmDecorator = new VoiceAlarmDecorator(notification);
        voiceAlarmDecorator.sendNotification("You have an appointment in: 12/8/2019");
        System.out.println("NOTIFICATION:");
        NotificationDecorator notificationDecorator = new NotificationDecorator(notification);
        notificationDecorator.sendNotification("You have an appointment in: 12/8/2019");
        System.out.println();
        //-----------------------------------------------------------

        //-------------------------(Template Method)-------------------------
        System.out.println("[*] Create appointment using Template Method... ");
        System.out.println("COMPLAINT APPOINTMENT:");
        Appointment complaintAppointment = new ComplaintAppointment();
        complaintAppointment.AppointmentProcess();

        System.out.println("NEW MAID APPOINTMENT:");
        Appointment newMaidAppointment = new NewMaidAppointment();
        newMaidAppointment.AppointmentProcess();

        System.out.println("RETURN MAID APPOINTMENT:");
        Appointment returnMaidAppointment = new ReturnMaidAppointment();
        returnMaidAppointment.AppointmentProcess();
        //-----------------------------------------------------------
    }
}

