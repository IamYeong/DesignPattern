package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BridgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge);

        BridgeAnimal fishA = new BridgeFish(new BridgeHunting1());
        BridgeAnimal tigerA = new BridgeTiger(new BridgeHunting2());

        fishA.HUNT();
        tigerA.HUNT();



    }
}
