package com.todaylunch.testproject;

public class AbstractCarFactory {

    private AbstractCarFactory() {
    }

    public static Car buildCar(CarType type) {

        Car car = null;
        FactoryLocation location = FactoryLocation.Asia;

        switch (location) {

            case USA:

                car = USAFactory.buildCar(type);
                break;

            case Asia:
                car = AsiaFactory.buildCar(type);
                break;

            case Default:
                car = DefaultFactory.buildCar(type);
                break;

        }

        return car;


    }

}
