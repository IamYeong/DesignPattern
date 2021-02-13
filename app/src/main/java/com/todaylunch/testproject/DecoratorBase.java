package com.todaylunch.testproject;

public class DecoratorBase implements Decorator {

    @Override
    public void draw() {
        System.out.println("기본기능!");
    }
}
