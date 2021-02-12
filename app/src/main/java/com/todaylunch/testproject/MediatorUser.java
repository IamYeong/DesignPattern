package com.todaylunch.testproject;

public abstract class MediatorUser {

    private MediatorInterfaceChatRoom mediator;
    private String id;
    private String name;

    public MediatorUser(MediatorInterfaceChatRoom room, String id, String name) {
        this.mediator = room;
        this.id = id;
        this.name = name;
    }

    public abstract void send(String msg, String userId);
    public abstract void recieve(String msg);

    public MediatorInterfaceChatRoom getMediator() {
        return mediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
