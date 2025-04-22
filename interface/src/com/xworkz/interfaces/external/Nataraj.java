package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.Pencil;

public class Nataraj implements Pencil {
    @Override
    public void use() {
        System.out.println("running use in nataraj");
    }
}
