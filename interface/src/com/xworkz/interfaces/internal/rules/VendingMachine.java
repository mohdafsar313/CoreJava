package com.xworkz.interfaces.internal.rules;

public interface VendingMachine {
    void start();
    void stop();
    void dispenseItem();
    void checkStock();
    void acceptPayment();
    void issueReceipt();
    void refill();
}
