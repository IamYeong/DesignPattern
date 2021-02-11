package com.todaylunch.testproject;

public class State3 implements State {

    private static State3 instance = new State3();
    private State3() {}

    public static State3 getInstance() {
        System.out.println("THREE");
        return instance;

    }

    @Override
    public void updateState(StateManager manager) {
        manager.setState(State1.getInstance());


    }
}
