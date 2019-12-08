package com.designpattern.abstractfactory;

public abstract class HouseMaidBuilding {

    protected abstract HouseMaid makeHouseMaid(String type, Maid maid);

    public HouseMaid orderhouseMaid(String type, Maid maid){
        HouseMaid houseMaid = makeHouseMaid(type, maid);
        houseMaid.order();
        return houseMaid;
    }
}
