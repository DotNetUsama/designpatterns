package com.designpattern.abstractfactory;

import java.util.Arrays;

public class SrilankanHouseMaid extends HouseMaid {

    private static final double cost = 149.99;

    public SrilankanHouseMaid(String name, int age) {
        super(name, age);
    }

    @Override
    public String order() {
        return "You've been ordered for Sri Lankan House Maid with this details:\n" +
                "Maid Name: " + getName() + ", " + "Age: " + getAge() + "\nand services : "
                + Arrays.toString(getServices().toArray()) + "and cost = " + this.cost +"$.\n";
    }
}
