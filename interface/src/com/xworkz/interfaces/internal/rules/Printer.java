package com.xworkz.interfaces.internal.rules;

public interface Printer {
    void turnOn();
    void turnOff();
    void print();
    void scan();
    void copy();
    void cancelJob();
    void checkInkLevel();
    void connectToWiFi();
    void cleanNozzles();
}
