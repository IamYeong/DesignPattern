package com.todaylunch.testproject;

public class Circle implements FlyweightShape {

    private String name;
    private int x;
    private int y;

    public Circle(String name) {

            this.name = name;


    }

    @Override
    public void setColor(String color) {
        this.name = color;

    }

    @Override
    public void setX(int x) {
        this.x = x;

    }

    @Override
    public void setY(int y) {
        this.y = y;

    }

    @Override
    public void draw() {

        System.out.println("Create Circle [" + name + ", " + x + ", " + y + "]");

    }
}
