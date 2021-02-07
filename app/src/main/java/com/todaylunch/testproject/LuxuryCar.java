package com.todaylunch.testproject;

public class LuxuryCar extends Car {


    public LuxuryCar(FactoryLocation location) {

        super(location, CarType.Luxury);
        construct();

    }

    @Override
    public void construct() {

        System.out.println("luxury");
    }
}
