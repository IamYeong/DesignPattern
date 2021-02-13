package com.todaylunch.testproject;

public class DecoratorMain implements Decorator {

    private Decorator decorator;

    public DecoratorMain(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public void draw() {
        decorator.draw();
    }
}
