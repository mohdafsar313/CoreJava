package com.xworkz.interfaces.internal.rules;

public interface ATM {
    void insertCard();
    void enterPin();
    void withdrawCash();
    void depositCash();
    void checkBalance();
    void printReceipt();
    void ejectCard();
    void displayWelcomeMessage();
    void shutdown();
}
