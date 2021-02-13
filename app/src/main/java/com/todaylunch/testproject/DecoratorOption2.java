package com.todaylunch.testproject;

public class DecoratorOption2 extends DecoratorMain {

    public DecoratorOption2(Decorator decorator) {
        super(decorator);
    }

    @Override
    public void draw() {
        super.draw();
        addMethod();
    }

    private void addMethod() {
        System.out.println("-option2");
    }
}
