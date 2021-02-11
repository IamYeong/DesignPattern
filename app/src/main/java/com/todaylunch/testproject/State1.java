package com.todaylunch.testproject;

public class State1 implements State {

    private static State1 instance = new State1();

    private State1() {}

    public static State1 getInstance() {
        System.out.println("ONE");
        return instance;
    }

    @Override
    public void updateState(StateManager manager) {

        manager.setState(State2.getInstance());
    }
}
