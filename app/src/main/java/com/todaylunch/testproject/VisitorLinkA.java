package com.todaylunch.testproject;

public class VisitorLinkA implements VisiorRouter {

    @Override
    public void sendData(char[] data) {

    }

    @Override
    public void acceptData(char[] data) {

    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
