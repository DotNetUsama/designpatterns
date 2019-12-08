package com.designpattern.abstractfactory;

public class SrilankanMaidFactory implements MaidFactory {

    @Override
    public KitchenMaid orderKitchenMaid(Maid maid) {
        KitchenMaid kitchenMaid = new SrilankanKitchenMaid(maid.getName(), maid.getAge());
        System.out.println(kitchenMaid.order());
        return kitchenMaid;
    }

    @Override
    public HouseMaid orderHouseMaid(Maid maid) {
        HouseMaid houseMaid = new SrilankanHouseMaid(maid.getName(), maid.getAge());
        System.out.println(houseMaid.order());
        return houseMaid;
    }
}
