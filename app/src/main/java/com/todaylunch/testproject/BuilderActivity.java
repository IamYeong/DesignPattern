package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BuilderActivity extends AppCompatActivity {

    Button btn_input;
    EditText et_firstname, et_lastname, et_age, et_phone, et_address;
    TextView tv_fistname, tv_lastname, tv_age, tv_phone, tv_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);

        btn_input = findViewById(R.id.btn_builder_input);

        et_firstname = findViewById(R.id.et_builder_first_name);
        et_lastname = findViewById(R.id.et_builder_last_name);
        et_age = findViewById(R.id.et_builder_age);
        et_phone = findViewById(R.id.et_builder_phone);
        et_address = findViewById(R.id.et_builder_address);

        tv_fistname = findViewById(R.id.tv_builder_1);
        tv_lastname = findViewById(R.id.tv_builder_2);
        tv_age = findViewById(R.id.tv_builder_3);
        tv_phone = findViewById(R.id.tv_builder_4);
        tv_address = findViewById(R.id.tv_builder_5);


        btn_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    String firstName = et_firstname.getText().toString();
                    String lastName = et_lastname.getText().toString();
                    String age = et_age.getText().toString();
                    int realAge = Integer.parseInt(age);
                    String phone = et_phone.getText().toString();
                    String address = et_address.getText().toString();

                    buildUser(firstName, lastName, realAge, phone, address);


                } catch(Exception e) {

                }


            }
        });

    }

    private void buildUser(String firstName, String lastName, int age, String phone, String address) {

        BuilderPatternUser user = new BuilderPatternUser.UserBuilder(firstName, lastName)
                .age(age)
                .phone(phone)
                .address(address)
                .build();

        System.out.println(user);

        setTextUser(user);

    }

    private void setTextUser(BuilderPatternUser user) {

        String a = (String) Integer.toString(user.getAge());

        tv_fistname.setText(user.getFirstName());
        tv_lastname.setText(user.getLastName());
        System.out.println(a);
        tv_age.setText(a);
        tv_phone.setText(user.getPhone());
        tv_address.setText(user.getAddress());



    }



}
