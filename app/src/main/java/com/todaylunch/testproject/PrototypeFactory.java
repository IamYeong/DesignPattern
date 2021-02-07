package com.todaylunch.testproject;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

    private static Map<String, PrototypeCapable> protoTypes = new HashMap<>();


    public static class ModelType {

        public static final String MOVIE = "movie";
        public static final String ALBUM = "album";

    }

    static {
        protoTypes.put(ModelType.MOVIE, new PrototypeMovie());
        protoTypes.put(ModelType.ALBUM, new PrototypeAlbum());
        //Keep putting
    }

    public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException {

        return (PrototypeCapable) protoTypes.get(s).clone();

    }



}
