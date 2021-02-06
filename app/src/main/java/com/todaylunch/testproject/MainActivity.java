package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_singleton, btn_strategy, btn_factory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_singleton = findViewById(R.id.btn_singleton_main);
        btn_strategy = findViewById(R.id.btn_strategy);
        btn_factory = findViewById(R.id.btn_factory_main);


        btn_singleton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Singleton.class);
                startActivity(intent);


            }
        });



        btn_strategy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, StrategyPattern.class);
                startActivity(intent);

            }
        });

        btn_factory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, FactoryActivity.class);
                startActivity(intent);

            }
        });



    }
}
