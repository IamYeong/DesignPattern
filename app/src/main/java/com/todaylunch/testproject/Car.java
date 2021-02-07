package com.todaylunch.testproject;

public abstract class Car {

    private FactoryLocation mLocation;
    private CarType mType;

    public Car(FactoryLocation location, CarType type) {

        this.mLocation = location;
        this.mType = type;

    }

    public abstract void construct();

    @Override
    public String toString() {
        return mLocation + ", " + mType;
    }

}
