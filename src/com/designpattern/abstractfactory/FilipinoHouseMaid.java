package com.designpattern.abstractfactory;

import java.util.Arrays;

public class FilipinoHouseMaid extends HouseMaid {

    private static final double cost = 199.99;

    public FilipinoHouseMaid(String name, int age) {
        super(name, age);
    }

    @Override
    public String order() {
        return "You've been ordered for Filipino House Maid with this details:\n" +
                "Maid Name: " + getName() + ", " + "Age: " + getAge() + "\nand services : "
                + Arrays.toString(getServices().toArray()) + "and cost = " + this.cost +"$.\n";
    }
}
