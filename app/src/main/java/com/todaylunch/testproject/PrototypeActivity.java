package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PrototypeActivity extends AppCompatActivity {

    PrototypeMovie movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype);


        try {
            movie = (PrototypeMovie) PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE);

        } catch(CloneNotSupportedException e) {

        }

        System.out.println(movie);
        System.out.println(movie.toString());


    }
}
