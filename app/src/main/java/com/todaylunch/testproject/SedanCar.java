package com.todaylunch.testproject;

public class SedanCar extends Car {


    public SedanCar(FactoryLocation location) {

        super(location, CarType.Sedan);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("sedan");
    }
}
