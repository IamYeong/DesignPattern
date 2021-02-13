package com.todaylunch.testproject;

public class AdapterMP4 implements AdapterMediaPackage {

    @Override
    public void playPackage(String fileName) {

        System.out.println(fileName + " play to MP4 MediaPackage");

    }
}
