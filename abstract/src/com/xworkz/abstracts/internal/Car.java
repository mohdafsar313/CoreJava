package com.xworkz.abstracts.internal;

public class Car extends AbstractVehicle{
    public Car(){

    }
    public void show(){
        System.out.println("running show in car");
    }
    @Override
    public void display() {
        super.display();
    }
}
