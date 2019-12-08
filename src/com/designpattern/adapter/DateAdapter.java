package com.designpattern.adapter;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateAdapter implements CustomersDates {

    //this line has been removed after make CalenderService Singleton.
//    private CalenderService adaptee;

    @Override
    public void orderDates(List<SpecialDate> dates) throws ParseException {
        List<Date> unsortedDates = new ArrayList<>();

        for (SpecialDate date : dates) {
            unsortedDates.add(date.getDate());
        }

        System.out.println("Unsorted Dates:");
        for (Date date: unsortedDates) {
            System.out.println(date);
        }

        CalenderService.getInstance().sort(unsortedDates);

        System.out.println("Sorted Dates: ");
        for (Date date: unsortedDates) {
            System.out.println(date);
        }
        System.out.println();
    }
}
