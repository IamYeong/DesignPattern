package com.todaylunch.testproject;

public class IteratorConcrete implements Iterator<IteratorTestObject> {

    private IteratorTestObject[] items;
    private int position;

    public IteratorConcrete(IteratorTestObject[] array) {
        this.items = array;
        position = 0;

    }

    @Override
    public boolean hasNext() {


        if (position >= items.length ) {
            System.out.println(position + ", " + items.length);
            return false;
        }
        return true;

    }

    @Override
    public void reset() {
        position = 0;
    }

    @Override
    public IteratorTestObject next() {
        return items[position++];
    }

    @Override
    public IteratorTestObject currentItem() {
        return items[position];
    }
}
