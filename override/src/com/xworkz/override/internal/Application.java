package com.xworkz.override.internal;

public class Application {
    private String name;
    private String tool;

    public Application(String name,String tool) {
        System.out.println("Application: Constructor is running");
    }

    public void launch() {
        System.out.println("Application: Launching the application");
    }
    @Override
    public String toString() {
        return "application name"+name+", application tool"+tool;
    }

}
