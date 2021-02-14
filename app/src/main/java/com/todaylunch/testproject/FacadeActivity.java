package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FacadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade);

        Facade movieFacade = new Facade("BEGIN AGAIN", "COKE");
        movieFacade.view();
    }
}
