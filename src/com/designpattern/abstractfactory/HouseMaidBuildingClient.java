package com.designpattern.abstractfactory;

public class HouseMaidBuildingClient extends HouseMaidBuilding {
    @Override
    protected HouseMaid makeHouseMaid(String type, Maid maid) {
        HouseMaid houseMaid = null;
        MaidFactory maidFactory = null;

        if(type.equals("Filipion")){
            maidFactory = new FilipinoMaidFactory();
            houseMaid =  maidFactory.orderHouseMaid(maid);
        }else{
            if(type.equals("Sri lankan")){
                maidFactory = new SrilankanMaidFactory();
                houseMaid =  maidFactory.orderHouseMaid(maid);
            }
        }
        return houseMaid;
    }
}
