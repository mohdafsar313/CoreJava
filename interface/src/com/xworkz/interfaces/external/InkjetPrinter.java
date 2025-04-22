package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.Printer;

public class InkjetPrinter implements Printer {
    @Override
    public void turnOn() {
        System.out.println("Printer is powered on");
    }

    @Override
    public void turnOff() {
        System.out.println("Printer is powered off");
    }

    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }

    @Override
    public void copy() {
        System.out.println("Copying document...");
    }

    @Override
    public void cancelJob() {
        System.out.println("Cancelling current job");
    }

    @Override
    public void checkInkLevel() {
        System.out.println("Checking ink levels");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("Connecting to WiFi");
    }

    @Override
    public void cleanNozzles() {
        System.out.println("Cleaning printer nozzles");
    }
}
