package com.designpattern.abstractfactory;

public interface MaidFactory {

    KitchenMaid orderKitchenMaid(Maid maid);
    HouseMaid orderHouseMaid(Maid maid);
}
