package com.todaylunch.testproject;

public class BridgeTiger extends BridgeAnimal {

    public BridgeTiger(BridgeHuntingMethod method) {
        super(method);
    }

    public void HUNT() {
        System.out.println("TIGER");
        attacking();
        jumping();
        pointing();
        runnig();
    }



}
