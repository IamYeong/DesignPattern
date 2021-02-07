package com.todaylunch.testproject;

public class SmallCar extends Car {

    public SmallCar(FactoryLocation location) {

        super(location, CarType.Small);
        construct();

    }

    @Override
    public void construct() {

        System.out.println("small");

    }
}
