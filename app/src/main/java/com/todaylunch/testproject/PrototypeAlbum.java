package com.todaylunch.testproject;

public class PrototypeAlbum implements PrototypeCapable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        System.out.println("Cloning Album");
        return (PrototypeAlbum) super.clone();
    }

    @Override
    public String toString() {
        return "Album";
    }
}
