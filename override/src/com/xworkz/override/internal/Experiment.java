package com.xworkz.override.internal;

public class Experiment {
    private String name;
    private String type;
    public Experiment(String name,String type) {
        System.out.println("Experiment: Constructor is running");
    }

    public void conduct() {
        System.out.println("Experiment: Conducting a general experiment");
    }
    @Override
    public String toString() {
        return "experiment name"+name+", type"+type;
    }
}
