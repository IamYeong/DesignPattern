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
        //여기까지의 상태를 memento에 저장

        article.setContent("DEF");
        article.setTitle("ddddddd");
        System.out.println(article);
        //원치 않는 정보 입력

        article.restore(memento);
        //저장돼있던 memento정보를 restore 메서드를 통해 다시 setter
        System.out.println(article);

    }
}
