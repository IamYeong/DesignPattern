package com.todaylunch.testproject;

public class CommandAOn implements Command {

    CommandA commandA;

    public CommandAOn(CommandA commandA) {
        super();
        this.commandA = commandA;

    }

    @Override
    public void excute() {
        System.out.println("CommandAOn");
        commandA.turnOn();
    }
}
