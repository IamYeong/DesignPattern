package com.todaylunch.testproject;

import android.widget.Toast;

public class FactoryOne extends Factory {

    public FactoryOne() {
        super(FactoryType.Type1);
        construct();

    }

    @Override
    protected void construct() {

        System.out.println("One");

    }
}
