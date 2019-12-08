package com.designpattern.adapter;

import java.text.ParseException;
import java.util.List;

public interface CustomersDates {
    void orderDates(List<SpecialDate> dates) throws ParseException;
}
