package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ObserverActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_input, btn_one_add, btn_one_remove, btn_two_add, btn_two_remove, btn_three_add, btn_three_remove;
    EditText editText;
    TextView tv_one, tv_two, tv_three;
    final ObserverOne observerOne = new ObserverOne();
    final ObserverTwo observerTwo = new ObserverTwo();
    final ObserverThree observerThree = new ObserverThree();

    final Publisher publisher = new Publisher();

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_observer :
                String m = editText.getText().toString();
                publisher.notifyUpdate(m);
                break;


            case R.id.btn_observer_one_add :
                publisher.attach(observerOne);
                break;

            case R.id.btn_observer_one_remove :
                publisher.detach(observerOne);
                break;

            case R.id.btn_observer_two_add :
                publisher.attach(observerTwo);
                break;

            case R.id.btn_observer_two_remove :
                publisher.detach(observerTwo);
                break;

            case R.id.btn_observer_three_add :
                publisher.attach(observerThree);
                break;

            case R.id.btn_observer_three_remove :
                publisher.detach(observerThree);
                break;

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);

        btn_input = findViewById(R.id.btn_observer);
        btn_one_add = findViewById(R.id.btn_observer_one_add);
        btn_two_add = findViewById(R.id.btn_observer_two_add);
        btn_three_add = findViewById(R.id.btn_observer_three_add);

        btn_one_remove = findViewById(R.id.btn_observer_one_remove);
        btn_two_remove = findViewById(R.id.btn_observer_two_remove);
        btn_three_remove = findViewById(R.id.btn_observer_three_remove);

        editText = findViewById(R.id.et_observer);

        tv_one = findViewById(R.id.tv_observer_one);
        tv_two = findViewById(R.id.tv_observer_two);
        tv_three = findViewById(R.id.tv_observer_three);

        btn_one_add.setOnClickListener(this);
        btn_two_add.setOnClickListener(this);
        btn_three_add.setOnClickListener(this);
        btn_one_remove.setOnClickListener(this);
        btn_two_remove.setOnClickListener(this);
        btn_three_remove.setOnClickListener(this);
        btn_input.setOnClickListener(this);





    }
}
