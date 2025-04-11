package com.xworkz.override.internal;

public class Smartphone extends Device{
    public Smartphone() {
        System.out.println("Smartphone: Constructor is running");
    }

    @Override
    public void powerOn() {
        System.out.println("Smartphone: Powering on with fingerprint authentication");
    }

    public void takePhoto() {
        System.out.println("Smartphone: Taking a photo");
    }

    public void browseInternet() {
        System.out.println("Smartphone: Browsing the internet");
    }
}
