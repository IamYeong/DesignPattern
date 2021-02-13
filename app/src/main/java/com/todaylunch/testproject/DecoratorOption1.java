package com.todaylunch.testproject;

public class DecoratorOption1 extends DecoratorMain {

    public DecoratorOption1(Decorator decorator) {
        super(decorator);
    }

    private void addMethod() {
        System.out.println("-option1");
    }

    @Override
    public void draw() {
        super.draw();
        addMethod();
    }
}
