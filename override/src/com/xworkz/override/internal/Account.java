package com.xworkz.override.internal;

public class Account {
    private String account_name;
    private int account_number;
    public Account(String account_name,int account_number) {
        System.out.println("Account: Constructor is running");
        this.account_name=account_name;
        this.account_number=account_number;
    }

    public void displayBalance() {
        System.out.println("Account: Displaying account balance");
    }
    @Override
    public String toString() {
        return "account name"+account_name+", account number"+account_number;
    }
}
