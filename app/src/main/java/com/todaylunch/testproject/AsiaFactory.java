package com.todaylunch.testproject;

public class AsiaFactory {

    public static Car buildCar(CarType type) {

        Car car = null;

        switch(type) {

            case Small :
                car = new SmallCar(FactoryLocation.Asia);
                break;

            case Sedan :
                car = new SedanCar(FactoryLocation.Asia);
                break;

            case Luxury:
                car = new LuxuryCar(FactoryLocation.Asia);
                break;

        }

        return car;

    }

}
