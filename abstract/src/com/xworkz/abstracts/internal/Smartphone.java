package com.xworkz.abstracts.internal;

public  class Smartphone extends AbstractDevice{
    public Smartphone(){

    }
    public void show(){
        System.out.println("running show in smartphone");
    }
    @Override
    public void display(){
        System.out.println("overriding display in smartphone");
    }
}
