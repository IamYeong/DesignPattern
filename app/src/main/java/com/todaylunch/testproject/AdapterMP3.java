package com.todaylunch.testproject;

public class AdapterMP3 implements AdapterMediaPlayer {

    @Override
    public void playPlayer(String fileName) {
        System.out.println(fileName + " play to MP3 mediaPlayer");
    }
}
