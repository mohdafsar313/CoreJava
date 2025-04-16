package com.xworkz.override.internal;

public class Bank {
    private String name;
    private int acc_number;
    public Bank(String name, int acc_number) {
        System.out.println("Bank: Constructor is running");
    }

    public void processTransaction() {
        System.out.println("Bank: Processing transaction at the branch");
    }
    @Override
    public String toString() {
        return "bank name"+name+", account number"+acc_number;
    }
}
