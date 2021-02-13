package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class VisitorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitor);

        VisitorConfigurator config = new VisitorConfigurator();
        VisitorConfigurator2 config2 = new VisitorConfigurator2();

        VisitorLinkA linkA = new VisitorLinkA();
        VisitorLinkB linkB = new VisitorLinkB();
        VisitorLinkC linkC = new VisitorLinkC();

        linkA.accept(config);
        linkA.accept(config2);

        linkB.accept(config);
        linkB.accept(config2);

        linkC.accept(config);
        linkC.accept(config2);

    }
}
