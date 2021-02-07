package com.todaylunch.testproject;

public class USAFactory {

    public static Car buildCar(CarType type) {

        Car car = null;

        switch(type) {

            case Small :
                car = new SmallCar(FactoryLocation.USA);
                break;

            case Sedan :
                car = new SedanCar(FactoryLocation.USA);
                break;

            case Luxury:
                car = new LuxuryCar(FactoryLocation.USA);
                break;

        }

        return car;

    }
}
