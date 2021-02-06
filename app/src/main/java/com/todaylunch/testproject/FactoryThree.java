package com.todaylunch.testproject;

public class FactoryThree extends Factory {

    public FactoryThree() {

        super(FactoryType.Type3);
        construct();

    }

    @Override
    protected void construct() {

        System.out.println("Three");

    }
}
