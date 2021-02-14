package com.todaylunch.testproject;

public class BridgeAnimal {

    BridgeHuntingMethod method;

    public BridgeAnimal(BridgeHuntingMethod method) {
        this.method = method;
    }

    public void runnig() {
        method.run();
    }

    public void attacking() {
        method.attack();
    }

    public void jumping() {
        method.jump();
    }

    public void pointing() {
        method.pointing();
    }

    public void HUNT() {
        pointing();
        runnig();
        jumping();
        attacking();
    }


}
