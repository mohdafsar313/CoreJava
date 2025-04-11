package com.xworkz.override.internal;

public class SavingsAccount extends Account{
    public SavingsAccount() {
        System.out.println("SavingsAccount: Constructor is running");
    }

    @Override
    public void displayBalance() {
        System.out.println("SavingsAccount: Showing savings account balance");
    }

    public void deposit() {
        System.out.println("SavingsAccount: Depositing amount");
    }

    public void withdraw() {
        System.out.println("SavingsAccount: Withdrawing amount");
    }
}
