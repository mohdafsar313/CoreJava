package com.xworkz.jdbc.external;

import com.xworkz.jdbc.internal.ShippingService;

public class StandardShipping implements ShippingService {
    @Override
    public void calculateShippingCost() {
        System.out.println("Calculating standard shipping cost...");

    }
}
