package com.todaylunch.testproject;

public class BridgeHunting1 implements BridgeHuntingMethod {

    @Override
    public void attack() {
        System.out.println("믈에서 공격");
    }

    @Override
    public void run() {
        System.out.println("헤엄치기");
    }

    @Override
    public void jump() {
        System.out.println("퐁당");
    }

    @Override
    public void pointing() {
        System.out.println("주파수감지");

    }
}
