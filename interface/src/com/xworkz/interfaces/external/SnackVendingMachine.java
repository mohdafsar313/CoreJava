package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.VendingMachine;

public class SnackVendingMachine implements VendingMachine {
    @Override
    public void start() {
        System.out.println("Snack vending machine is starting");
    }

    @Override
    public void stop() {
        System.out.println("Snack vending machine is stopping");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Dispensing snack item");
    }

    @Override
    public void checkStock() {
        System.out.println("Checking stock of snacks");
    }

    @Override
    public void acceptPayment() {
        System.out.println("Accepting payment for the snack");
    }

    @Override
    public void issueReceipt() {
        System.out.println("Issuing receipt for the snack purchase");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the snack vending machine");
    }
}
