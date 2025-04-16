package com.xworkz.override.internal;

public class Entertainment {
    private String name;
    private String type;
    public Entertainment(String name,String type) {
        System.out.println("Entertainment: Constructor is running");
    }

    public void enjoy() {
        System.out.println("Entertainment: Enjoying general entertainment");
    }
    @Override
    public String toString() {
        return "entertainment name"+name+", type"+type;
    }
}
