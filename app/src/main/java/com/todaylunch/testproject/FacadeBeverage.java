package com.todaylunch.testproject;

public class FacadeBeverage {

    private String drinkName;

    public FacadeBeverage(String drinkName) {
        this.drinkName = drinkName;
    }

    public void drink() {
        System.out.println(drinkName + " 음료 준비");
    }

}
