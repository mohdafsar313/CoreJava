package com.xworkz.abstracts.internal;

public class Video extends AbstractMedia{
    @Override
    public void display() {
        System.out.println("overridden method display in media");
    }
    @Override
    public void content(){
        System.out.println("overridden method content in media");
    }
}
