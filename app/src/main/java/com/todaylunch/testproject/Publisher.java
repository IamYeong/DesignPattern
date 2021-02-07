package com.todaylunch.testproject;

import java.util.ArrayList;

public class Publisher implements Subject {

    public ArrayList<MyObserver> observers = new ArrayList<>();


    @Override
    public void attach(MyObserver o) {
        observers.add(o);
    }

    @Override
    public void detach(MyObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(String m) {
        for (MyObserver o : observers) {
            o.update(m);
        }
    }
}
