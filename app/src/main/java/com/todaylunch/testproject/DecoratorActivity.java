package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DecoratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorator);

        Decorator decorator = new DecoratorOption2(new DecoratorOption1(new DecoratorBase()));
        decorator.draw();

    }
}
