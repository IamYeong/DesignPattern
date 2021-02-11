package com.todaylunch.testproject;

public class StateManager {

    private State state;

    public StateManager(State state) {
        super();

        this.state = state;

        if (state == null) {
            this.state = State1.getInstance();
        }

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void stateUpdate() {

        state.updateState(this);

    }

}
