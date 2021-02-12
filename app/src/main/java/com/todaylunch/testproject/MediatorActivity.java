package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MediatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediator);

        MediatorInterfaceChatRoom room = new Mediator();

        MediatorUser user1 = new MediatorUserOne(room, "1", "A");
        MediatorUser user2 = new MediatorUserOne(room, "2", "B");
        MediatorUser user3 = new MediatorUserOne(room, "3", "C");

        room.addUser(user1);
        room.addUser(user2);
        room.addUser(user3);

        user1.send("HI", "3");
        user3.send("HELLO", "2");


    }
}
