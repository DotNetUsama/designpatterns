package com.designpattern.abstractfactory;

public abstract class KitchenMaidBuilding {

    protected abstract KitchenMaid makeKitchenMaid(String type, Maid maid);

    public KitchenMaid orderKitchenMaid(String type, Maid maid){
        KitchenMaid kitchenMaid = makeKitchenMaid(type, maid);
        kitchenMaid.order();
        return kitchenMaid;
    }
}
