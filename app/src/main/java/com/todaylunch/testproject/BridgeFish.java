package com.todaylunch.testproject;

public class BridgeFish extends BridgeAnimal {

    public BridgeFish(BridgeHuntingMethod method) {
        super(method);
    }

    public void HUNT() {
        System.out.println("FISH");
        runnig();
        attacking();
        jumping();
        pointing();
    }

}
