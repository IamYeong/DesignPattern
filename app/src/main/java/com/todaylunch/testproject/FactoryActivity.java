package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FactoryActivity extends AppCompatActivity {

    private Button btn;
    private Spinner spr;
    private TextView tv;
    private ArrayAdapter<Integer> arrayAdapter;
    private ArrayList<Integer> arrayList;
    private Factory factory = null;
    private String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);

        btn = findViewById(R.id.btn_factory);
        spr = findViewById(R.id.spr_factory);
        tv = findViewById(R.id.tv_factory);

        setSpinner(3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv.setText(type + ", " + factory.toString());

            }
        });

        spr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch(position) {

                    case 0 :
                        factory = CreationFactory.BuildFactory(FactoryType.Type1);
                        type = "ONE";
                        break;

                    case 1 :
                        factory = CreationFactory.BuildFactory(FactoryType.Type2);
                        type = "TWO";
                        break;

                    case 2 :
                        factory = CreationFactory.BuildFactory(FactoryType.Type3);
                        type = "THREE";
                        break;

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }

    private void setSpinner(int spinnerCount) {

        arrayList = new ArrayList<>();


        for (int i = 0; i < spinnerCount; i++) {

            arrayList.add(i);

        }

        arrayAdapter = new ArrayAdapter<Integer>(this, R.layout.support_simple_spinner_dropdown_item, arrayList);
        spr.setAdapter(arrayAdapter);

    }

}
