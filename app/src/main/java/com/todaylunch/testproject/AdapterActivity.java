package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        AdapterMediaPlayer mp3_file_1 = new AdapterMP3();
        AdapterMediaPlayer mp3_file_2 = new AdapterMP3();

        AdapterMediaPackage mp4_file_1 = new AdapterMP4();
        AdapterMediaPackage mp4_file_2 = new AdapterMP4();

        Adapter format_file_to_mp3 = new Adapter(mp4_file_2);

        mp3_file_1.playPlayer("ONE");
        mp3_file_2.playPlayer("TWO");

        mp4_file_1.playPackage("THREE");
        mp4_file_2.playPackage("FOUR");

        format_file_to_mp3.playPlayer("FIVE");



    }
}
