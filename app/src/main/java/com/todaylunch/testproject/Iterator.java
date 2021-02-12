package com.todaylunch.testproject;

public interface Iterator<E> {

    boolean hasNext();

    void reset();

    E next();

    E currentItem();


}
