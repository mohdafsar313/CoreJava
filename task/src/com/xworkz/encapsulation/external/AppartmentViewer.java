package com.xworkz.encapsulation.external;
import com.xworkz.encapsulation.internal.Appartment;

public class AppartmentViewer {
    public void display() {
        Appartment appartment = new Appartment();
        System.out.println("Appartment Info (read-only):");
        System.out.println("Name: " + appartment.getName());
        System.out.println("Location: " + appartment.getLocation());
    }
}
