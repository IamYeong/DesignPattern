package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_singleton, btn_strategy, btn_factory, btn_observer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_singleton = findViewById(R.id.btn_singleton_main);
        btn_strategy = findViewById(R.id.btn_strategy);
        btn_factory = findViewById(R.id.btn_factory_main);
        btn_observer = findViewById(R.id.btn_observer_main);

        btn_singleton.setOnClickListener(this);
        btn_strategy.setOnClickListener(this);
        btn_factory.setOnClickListener(this);
        btn_observer.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_singleton_main :
                Intent intent = new Intent(MainActivity.this, Singleton.class);
                startActivity(intent);
                break;

            case R.id.btn_strategy :
                Intent intent2 = new Intent(MainActivity.this, StrategyPattern.class);
                startActivity(intent2);
                break;

            case R.id.btn_factory_main :
                Intent intent3 = new Intent(MainActivity.this, FactoryActivity.class);
                startActivity(intent3);
                break;

            case R.id.btn_observer_main :
                Intent intent4 = new Intent(MainActivity.this, ObserverActivity.class);
                startActivity(intent4);
                break;

        }

    }
}
