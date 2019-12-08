package com.designpattern.adapter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SpecialDate {

    private String day;
    private String month;
    private String year;

    public SpecialDate() {
    }

    public SpecialDate(String day, String month, String year) {

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Date getDate() throws ParseException {
        String fullDate = this.month + " " + this.day + ", "+
                this.year;
        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        Date requiredDate = format.parse(fullDate);
        return requiredDate;
    }



}
