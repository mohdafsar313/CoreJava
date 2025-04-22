package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.Phone;

public class SmartPhone implements Phone {
    @Override
    public void call() {
        System.out.println("Calling using smartphone");
    }

    @Override
    public void text() {
        System.out.println("Sending text message from smartphone");
    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing internet on smartphone");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking photo with smartphone camera");
    }

    @Override
    public void charge() {
        System.out.println("Charging the smartphone");
    }
}
