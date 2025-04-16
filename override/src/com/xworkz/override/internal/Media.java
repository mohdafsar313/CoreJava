package com.xworkz.override.internal;

public class Media {
    private String name;
    private String type;
    public Media(String name,String type) {
        System.out.println("Media: Constructor is running");
    }

    public void play() {
        System.out.println("Media: Playing media content");
    }
    @Override
    public String toString() {
        return "media name"+name+", type"+type;
    }
}
