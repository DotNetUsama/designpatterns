package com.designpattern.abstractfactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class KitchenMaid extends Maid {

    private static List<String> services = Arrays.asList("Cooking", "Coffee & Tea Making");

    public KitchenMaid(String name, int age) {
        super(name, age);
    }

    public List<String> getServices() {
        return services;
    }

    public void setServices(ArrayList<String> services) {
        this.services = services;
    }

    public abstract String order();
}
