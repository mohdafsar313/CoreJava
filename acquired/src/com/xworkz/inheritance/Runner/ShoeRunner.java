package com.xworkz.inheritance.Runner;

import com.xworkz.inheritance.external.NikeShoe;
import com.xworkz.inheritance.internal.AdidasShoe;
import com.xworkz.inheritance.internal.Shoe;

public class ShoeRunner {
    public static void main(String[] args) {
        NikeShoe nikeshoe = new NikeShoe();
        NikeShoe.use();
        AdidasShoe adidasshoe = new AdidasShoe();
        AdidasShoe.uses();

    }
}
