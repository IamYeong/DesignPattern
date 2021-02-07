package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AbstractFactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory);

        System.out.println(AbstractCarFactory.buildCar(CarType.Small));
        System.out.println(AbstractCarFactory.buildCar(CarType.Sedan));
        System.out.println(AbstractCarFactory.buildCar(CarType.Luxury));



    }
}
