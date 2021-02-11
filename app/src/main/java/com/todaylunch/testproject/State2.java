package com.todaylunch.testproject;

public class State2 implements State {

    private static State2 instance = new State2();
    private State2() {}

    public static State2 getInstance() {
        System.out.println("TWO");
        return instance;
    }




    @Override
    public void updateState(StateManager manager) {
        manager.setState(State3.getInstance());

    }
}
