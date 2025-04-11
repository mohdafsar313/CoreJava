package com.xworkz.override.runner;

import com.xworkz.override.internal.Generator;
import com.xworkz.override.internal.Invertor;

public class Runner {
    public static void main(String[] args) {
        Generator generator =new Invertor();
        generator.light();

        Invertor invertor=new Invertor();
        invertor.backup();

        Invertor invertor1=(Invertor) invertor;
        invertor.backup();
    }
}
