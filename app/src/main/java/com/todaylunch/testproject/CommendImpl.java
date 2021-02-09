package com.todaylunch.testproject;

public class CommendImpl {

    private Command command;

    public void setCommand(Command command) {

        this.command = command;

    }

    public void buttonPressed() {
        command.excute();
    }

}
