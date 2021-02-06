package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Singleton extends AppCompatActivity {

    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);

        btn = findViewById(R.id.btn_singleton);
        textView = findViewById(R.id.tv_singleton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SingletonPattern instance = SingletonPattern.getInstance();

                textView.setText(instance.toString());
                Log.d("hash", instance.toString());

                Toast.makeText(Singleton.this, "싱글턴은 자원이 하나!", Toast.LENGTH_SHORT).show();


            }
        });



    }
}
