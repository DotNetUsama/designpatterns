package com.designpattern.abstractfactory;

public class FilipinoMaidFactory implements MaidFactory {

    @Override
    public KitchenMaid orderKitchenMaid(Maid maid) {
        KitchenMaid kitchenMaid = new FilipinoKitchenMaid(maid.getName(), maid.getAge());
        System.out.println(kitchenMaid.order());
        return kitchenMaid;
    }

    @Override
    public HouseMaid orderHouseMaid(Maid maid) {
        HouseMaid houseMaid = new FilipinoHouseMaid(maid.getName(), maid.getAge());
        System.out.println(houseMaid.order());
        return houseMaid;
    }
}
