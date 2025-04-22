package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.Pen;

public class Doms implements Pen {
    @Override
    public void write() {
        System.out.println("running write in doms");
    }
}
