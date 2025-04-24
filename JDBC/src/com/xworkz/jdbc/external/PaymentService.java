package com.xworkz.jdbc.external;

import com.xworkz.jdbc.internal.PaymentMethod;

public class PaymentService {
    private PaymentMethod paymentMethod;

    public PaymentService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void executePayment() {
        this.paymentMethod.processPayment();
        if (this.paymentMethod != null) {
            System.out.println("Payment processed successfully.");
        } else {
            System.out.println("Payment method is null");
        }
    }
}
