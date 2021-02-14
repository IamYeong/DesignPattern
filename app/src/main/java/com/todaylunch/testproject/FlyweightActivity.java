package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FlyweightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flyweight);

        String[] names = {"A", "B", "C"};

        for (int i = 0; i < 20; i++) {
            FlyweightShape shape = FlyweightFactory.getShape(names[(int) (Math.random()*3)]);
            shape.setX((int) (Math.random() * 30));
            shape.setY((int) (Math.random() * 40));
            shape.draw();
        }



    }
}
