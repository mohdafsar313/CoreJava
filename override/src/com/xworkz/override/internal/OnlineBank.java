package com.xworkz.override.internal;

public class OnlineBank extends Bank{
    public OnlineBank() {
        System.out.println("OnlineBank: Constructor is running");
    }

    @Override
    public void processTransaction() {
        System.out.println("OnlineBank: Processing transaction through mobile app");
    }

    public void checkBalance() {
        System.out.println("OnlineBank: Checking account balance online");
    }

    public void transferFunds() {
        System.out.println("OnlineBank: Transferring funds between accounts");
    }
}
