package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CommandActivity extends AppCompatActivity {

    private Button btn;
    private TextView tv;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command);

        btn = findViewById(R.id.btn_command);
        tv = findViewById(R.id.tv_command);

        final CommandA commandA = new CommandA();
        //CommandB...CommandC...etc.(any devices and function in Device)

        final CommandInvoker invoker = new CommandInvoker();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (i) {
                    case 0 :
                        invoker.setCommandA(new CommandAOn(commandA));
                        invoker.buttonPress();
                        tv.setText("POWER ON");
                        i++;
                        break;

                    case 1 :
                        invoker.setCommandA(new CommandAUpTwo(commandA));
                        invoker.buttonPress();
                        tv.setText("POWER UP TO TWO");
                        i++;
                        break;


                    case 2 :
                        invoker.setCommandA(new CommandAOff(commandA));
                        invoker.buttonPress();
                        tv.setText("POWER OFF");
                        i = 0;
                        break;
                }

            }
        });


    }
}
