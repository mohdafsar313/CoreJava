package com.xworkz.abstracts.internal;

public abstract class AbstractShoe {
    private String name;
    private String quality;

    public AbstractShoe(String name,String quality){
        this.name=name;
        this.quality=quality;
    }
    public void info(){
        System.out.println("name of the shoe "+name);
        System.out.println("quality of the shoe "+quality);

    }

}
