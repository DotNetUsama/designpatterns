package com.designpattern.abstractfactory;


public class KitchenMaidBuildingClient extends KitchenMaidBuilding {
    @Override
    protected KitchenMaid makeKitchenMaid(String type, Maid orderMaid) {
        KitchenMaid kitchenMaid = null;
        MaidFactory maidFactory = null;

        if(type.equals("Filipion")){
            maidFactory = new FilipinoMaidFactory();
            kitchenMaid =  maidFactory.orderKitchenMaid(orderMaid);
        }else{
            if(type.equals("Sri lankan")){
                maidFactory = new SrilankanMaidFactory();
                kitchenMaid =  maidFactory.orderKitchenMaid(orderMaid);
            }
        }
        return kitchenMaid;
    }
}
