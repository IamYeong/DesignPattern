package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MementoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memento);

        MementoArticle article = new MementoArticle(1, "ARTICLE");
        article.setContent("ABC");
        System.out.println(article);

        MementoableArticle memento = article.createMemento();

        article.setContent("DEF");
        System.out.println(article);

        article.restore(memento);
        System.out.println(article);

    }
}
