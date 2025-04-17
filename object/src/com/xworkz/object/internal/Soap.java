package com.xworkz.object.internal;

import javax.swing.*;
import java.util.Objects;

public class Soap {
    private String color;
    private String type;
    private String smell;
    private int cost;
    public Soap(){

    }
    public void setSoap(String color,String type,String smell,int cost){
        this.color=color;
        this.type=type;
        this.smell=smell;
        this.cost=cost;

    }
    @Override
    public String toString() {
        return "Sand{color='" + color + "', type=" + type + ", smell=" + smell + ", cost='" + cost + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Sand) {
            Soap soap = (Soap) obj;
            if (Objects.equals(this.cost, soap.cost)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
