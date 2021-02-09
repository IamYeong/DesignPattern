package com.todaylunch.testproject;

public class CommandInvoker {

    Command command;

    public void setCommandA(Command command) {
        this.command = command;
    }

    public void buttonPress() {
        command.excute();

    }

}
