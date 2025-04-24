package com.xworkz.jdbc.external;

import com.xworkz.jdbc.internal.PaymentMethod;

public class DebitCardPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing payment with Debit Card...");

    }
}
