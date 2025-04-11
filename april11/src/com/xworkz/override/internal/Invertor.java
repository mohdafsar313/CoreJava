package com.xworkz.override.internal;

public class Invertor extends Generator{
    public Invertor(){
        System.out.println("running invertor ");
    }
    @Override
    public void light(){
        System.out.println("invertor:running light");
    }
    public void backup(){
        System.out.println("invertor:running light in backup");
    }
}
