package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TempleteMethodActivity extends AppCompatActivity {

    private TextView tv_one, tv_two, tv_three, tv_four;
    private TempleteMethod templeteMethod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templete_method);

        tv_one = findViewById(R.id.tv_template_one);
        tv_two = findViewById(R.id.tv_template_two);
        tv_three = findViewById(R.id.tv_template_three);
        tv_four = findViewById(R.id.tv_template_four);

        templeteMethod = new TempleteMethodImplememt();

        tv_one.setText(templeteMethod.method1());
        tv_two.setText(templeteMethod.method2());
        tv_three.setText(templeteMethod.method3());
        tv_four.setText(templeteMethod.method4());

        templeteMethod.startTempleteMethod();


    }
}
