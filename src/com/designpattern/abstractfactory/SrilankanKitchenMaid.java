package com.designpattern.abstractfactory;

import java.util.Arrays;

public class SrilankanKitchenMaid extends KitchenMaid {

    private static final double cost = 99.99;

    public SrilankanKitchenMaid(String name, int age) {
        super(name, age);
    }

    @Override
    public String order() {
        return "You've been ordered for Sri Lankan Kitchen Maid with this details:\n" +
                "Maid Name: " + getName() + ", " + "Age: " + getAge() + "\nand services : "
                + Arrays.toString(getServices().toArray()) + "and cost = " + this.cost +"$.\n";
    }

}
