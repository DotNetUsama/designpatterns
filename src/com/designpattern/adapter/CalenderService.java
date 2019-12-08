package com.designpattern.adapter;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class CalenderService{

    private static CalenderService calenderService;

    private CalenderService(){}

    public static CalenderService getInstance(){
        if(calenderService == null){
            calenderService = new CalenderService();
        }
        return calenderService;
    }

    public void sort(List<Date> unsortedList){
       Collections.sort(unsortedList);
    }
}
