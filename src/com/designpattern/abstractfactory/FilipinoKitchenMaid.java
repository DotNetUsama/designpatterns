package com.designpattern.abstractfactory;

import java.util.Arrays;

public class FilipinoKitchenMaid extends KitchenMaid {

    private static final double cost = 169.99;

    public FilipinoKitchenMaid(String name, int age) {
        super(name, age);
    }

    @Override
    public String order() {
        return "You've been ordered for Filipino Kitchen Maid with this details:\n" +
        "Maid Name: " + getName() + ", " + "Age: " + getAge() + "\nand services : "
                + Arrays.toString(getServices().toArray()) + "and cost = " + this.cost +"$.\n";
    }

}
