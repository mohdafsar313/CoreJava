package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.Furniture;

public class Chair implements Furniture {
    @Override
    public void use() {
        System.out.println("running use in chair");
    }
}
