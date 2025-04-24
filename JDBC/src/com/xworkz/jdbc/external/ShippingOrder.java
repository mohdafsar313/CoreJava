package com.xworkz.jdbc.external;

import com.xworkz.jdbc.internal.*;

public class ShippingOrder {
    private ShippingService shippingService;

    public ShippingOrder(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void processOrder() {
        this.shippingService.calculateShippingCost();
        if (this.shippingService != null) {
            System.out.println("Shipping order processed successfully.");
        } else {
            System.out.println("Shipping service is null");
        }
    }
}
