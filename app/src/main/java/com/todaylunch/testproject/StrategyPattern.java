package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StrategyPattern extends AppCompatActivity {

    Button btn_one;
    TextView tv_strategy;
    Spinner spr;
    ArrayAdapter<Integer> arrayAdapter;
    ArrayList<Integer> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy_pattern);

        btn_one = findViewById(R.id.btn_strategy_one);
        spr = findViewById(R.id.spr_strategy);
        tv_strategy = findViewById(R.id.tv_strategy);

        setArrayAdapter(3);

        final StrategyManager manager = new StrategyManager();

        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_strategy.setText(manager.getStrategy());


            }
        });

        spr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {

                    case 0 : manager.setAnyStrategy(new StrategyOne());
                    break;

                    case 1 : manager.setAnyStrategy(new StrategyTwo());
                    break;

                    case 2 : manager.setAnyStrategy(new StrategyThree());
                    break;

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }

    private void setArrayAdapter(int spinnerCount) {

        for (int i = 0; i < spinnerCount; i++ ) {

            arrayList.add(i);

        }

        Log.d("list : ", "" + arrayList);

        arrayAdapter = new ArrayAdapter<Integer>(this, R.layout.support_simple_spinner_dropdown_item, arrayList);

        spr.setAdapter(arrayAdapter);
        spr.setSelection(0);

    }

}
