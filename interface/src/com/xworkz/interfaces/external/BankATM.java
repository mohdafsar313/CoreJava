package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.ATM;

public class BankATM implements ATM {
    @Override
    public void insertCard() {
        System.out.println("Card inserted into ATM");
    }

    @Override
    public void enterPin() {
        System.out.println("PIN entered");
    }

    @Override
    public void withdrawCash() {
        System.out.println("Cash withdrawn successfully");
    }

    @Override
    public void depositCash() {
        System.out.println("Cash deposited successfully");
    }

    @Override
    public void checkBalance() {
        System.out.println("Displaying account balance");
    }

    @Override
    public void printReceipt() {
        System.out.println("Printing transaction receipt");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected from ATM");
    }

    @Override
    public void displayWelcomeMessage() {
        System.out.println("Welcome to ABC Bank ATM");
    }

    @Override
    public void shutdown() {
        System.out.println("ATM shutting down...");
    }
}
