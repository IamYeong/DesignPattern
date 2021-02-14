package com.todaylunch.testproject;

public class Adapter implements AdapterMediaPlayer {

    private AdapterMediaPackage adapterMediaPackage;

    Adapter(AdapterMediaPackage adapterMediaPackage) {
        this.adapterMediaPackage = adapterMediaPackage;
    }

    @Override
    public void playPlayer(String fileName) {

        adapterMediaPackage.playPackage(fileName + " play to mediaplayer for Adapter");

    }
}
