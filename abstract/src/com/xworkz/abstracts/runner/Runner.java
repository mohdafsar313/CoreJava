package com.xworkz.abstracts.runner;

import com.xworkz.abstracts.internal.*;

public class Runner {
    public static void main(String[] args) {
        AbstractVehicle abstractVehicle=new Car();
        abstractVehicle.display();
        System.out.println("========================================");
        AbstractDevice abstractDevice= new Smartphone() ;
        abstractDevice.display();
        System.out.println("========================================");
        AbstractMedia abstractMedia=new Video();
        abstractMedia.display();
        abstractMedia.content();
        System.out.println("========================================");
        AbstractShoe abstractShoe = new Nike("airforce","great");
        abstractShoe.info();
        System.out.println("========================================");
        AbstractAppliance abstractAppliance= new Machines();
        abstractAppliance.television();
        abstractAppliance.grinder();
        abstractAppliance.fridge();
        abstractAppliance.ac();


    }
}
