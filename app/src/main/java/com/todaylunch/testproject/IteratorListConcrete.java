package com.todaylunch.testproject;

public class IteratorListConcrete implements IteratorList<IteratorTestObject> {

    private IteratorTestObject[] items;

    public IteratorListConcrete(IteratorTestObject[] array) {
        this.items = array;
    }

    @Override
    public Iterator<IteratorTestObject> iterator() {
        return new IteratorConcrete(items);
    }
}
