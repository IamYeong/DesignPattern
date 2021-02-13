package com.todaylunch.testproject;

public interface VisiorRouter {

    void sendData(char[] data);
    void acceptData(char[] data);
    void accept(Visitor v);

}
