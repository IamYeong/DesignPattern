package com.todaylunch.testproject;

public interface MediatorInterfaceChatRoom {

    void sendMessage(String msg, String id);

    void addUser(MediatorUser user);

}
