package com.xworkz.override.internal;

public class Croma9 {
    private String name;
    private String location;
    public Croma9(String name,String location)
    {
        System.out.println("Running in the Croma9 Constructor");


    }

    public void kormangala()
    {
        System.out.println("Running in the Kormangala public method");

}
    @Override
    public String toString() {
        return "cfroma name"+name+",  location"+location;
    }

}
