package com.todaylunch.testproject;

public class MediatorUserOne extends MediatorUser {

    public MediatorUserOne(MediatorInterfaceChatRoom room, String id, String name) {
        super(room, id, name);
    }

    @Override
    public void send(String msg, String userId) {
        System.out.println(this.getName() + ": sending Message : " + msg);
        getMediator().sendMessage(msg, userId);

    }

    @Override
    public void recieve(String msg) {
        System.out.println(this.getName() + ": Received Message : " + msg);

    }
}
