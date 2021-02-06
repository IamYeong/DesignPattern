package com.todaylunch.testproject;

public class FactoryTwo extends Factory {

    public FactoryTwo() {
        super(FactoryType.Type2);
        construct();

    }

    @Override
    protected void construct() {
        System.out.println("Two");
    }
}
