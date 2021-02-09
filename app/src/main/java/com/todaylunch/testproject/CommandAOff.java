package com.todaylunch.testproject;

public class CommandAOff implements Command {

    CommandA commandA;

    CommandAOff(CommandA commandA) {
        super();

        this.commandA = commandA;
    }

    @Override
    public void excute() {
        System.out.println("CommandA Off");
        commandA.turnOff();

    }
}
