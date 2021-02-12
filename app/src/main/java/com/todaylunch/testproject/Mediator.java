package com.todaylunch.testproject;

import java.util.HashMap;
import java.util.Map;

public class Mediator implements MediatorInterfaceChatRoom {

    private Map<String, MediatorUser> userMap = new HashMap<>();

    @Override
    public void sendMessage(String msg, String id) {
        MediatorUser u = userMap.get(id);
        u.recieve(msg);
    }

    @Override
    public void addUser(MediatorUser user) {

        this.userMap.put(user.getId(), user);

    }
}
