package com.todaylunch.testproject;

public interface Subject {
    void attach(MyObserver o);
    void detach(MyObserver o);
    void notifyUpdate(String m);

}
