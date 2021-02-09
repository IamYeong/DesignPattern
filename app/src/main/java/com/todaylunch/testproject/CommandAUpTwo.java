package com.todaylunch.testproject;

public class CommandAUpTwo implements Command {

    CommandA commandA;

    CommandAUpTwo(CommandA commandA) {

        super();
        this.commandA = commandA;

    }

    @Override
    public void excute() {
        System.out.println("PowerUp!");
        commandA.powerUpToTwo();

    }
}
