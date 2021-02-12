package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class IteratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iterator);

        IteratorTestObject[] items = new IteratorTestObject[3];

        items[0] = new IteratorTestObject("ONE");
        items[1] = new IteratorTestObject("TWO");
        items[2] = new IteratorTestObject("THREE");

        IteratorList<IteratorTestObject> list = new IteratorListConcrete(items);
        Iterator<IteratorTestObject> iterator = list.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.hasNext());
            IteratorTestObject current = iterator.next();
            System.out.println(current.getName());
        }




    }
}
