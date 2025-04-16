package com.xworkz.override.internal;

public class Publisher {
    private String name;
    private String title;
    public Publisher() {
        System.out.println("Publisher: Constructor is running");
    }

    public void publish() {
        System.out.println("Publisher: Publishing general content");
    }
    public void setName(String name,String title){
        this.name=name;
        this.title=title;
    }
    @Override
    public String toString() {
        return "publisher name"+name+", title"+title;
    }
}

