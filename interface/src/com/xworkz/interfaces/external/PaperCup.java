package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.Cup;

public class PaperCup implements Cup {
    @Override
    public void shape() {
        System.out.println("running shape in papercup");
    }

    @Override
    public void use() {
        System.out.println("running use in papercup");

    }

    @Override
    public void display() {
        System.out.println("running display in papercup");

    }
}
