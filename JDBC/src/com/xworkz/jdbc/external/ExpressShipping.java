package com.xworkz.jdbc.external;

import com.xworkz.jdbc.internal.ShippingService;

public class ExpressShipping implements ShippingService {
    @Override
    public void calculateShippingCost() {
        System.out.println("Calculating express shipping cost...");
    }
}
