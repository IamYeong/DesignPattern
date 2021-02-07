package com.todaylunch.testproject;

public class ObserverOne implements MyObserver {

    private String message;

    @Override
    public void update(String message) {

        this.message = message;
        System.out.println(message);

    }

    public String getMessage() {
        return message;
    }



}
