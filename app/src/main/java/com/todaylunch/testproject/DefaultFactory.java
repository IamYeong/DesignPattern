package com.todaylunch.testproject;

public class DefaultFactory {


    public static Car buildCar(CarType type) {

        Car car = null;

        switch(type) {

            case Small :
                car = new SmallCar(FactoryLocation.Default);
                break;

            case Sedan :
                car = new SedanCar(FactoryLocation.Default);
                break;

            case Luxury:
                car = new LuxuryCar(FactoryLocation.Default);
                break;

        }

        return car;

    }


}
