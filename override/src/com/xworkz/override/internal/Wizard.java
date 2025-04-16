package com.xworkz.override.internal;

public class Wizard {
    private String name;
    private  String type;

    public Wizard() {
        System.out.println("Wizard: Constructor is running");
    }

    public void castSpell() {
        System.out.println("Wizard: Casting a general magical spell");
    }
    public void setName(String name,String type){
        this.name=name;
        this.type=type;
    }
    @Override
    public String toString() {
        return "wizard name"+name+", type"+type;
    }
}
