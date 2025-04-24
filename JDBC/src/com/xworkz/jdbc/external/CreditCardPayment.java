package com.xworkz.jdbc.external;

import com.xworkz.jdbc.internal.PaymentMethod;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing payment with Credit Card...");

    }
}
