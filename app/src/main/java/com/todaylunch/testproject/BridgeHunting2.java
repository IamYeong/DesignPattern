package com.todaylunch.testproject;

public class BridgeHunting2 implements BridgeHuntingMethod {

    @Override
    public void attack() {
        System.out.println("육지에서 공격");
    }

    @Override
    public void run() {
        System.out.println("네발로 뛰기");
    }

    @Override
    public void jump() {
        System.out.println("풀쩍");
    }

    @Override
    public void pointing() {
        System.out.println("수풀에서 소리로 감지");
    }
}
