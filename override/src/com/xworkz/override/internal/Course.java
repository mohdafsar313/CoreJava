package com.xworkz.override.internal;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Course {
    private String name;
    private int duration;

    public Course(String name,int duration) {
        System.out.println("Course: Constructor is running");
    }

    public void start() {
        System.out.println("Course: Starting the course");
    }
    @Override
    public String toString() {
        return "course name"+name+", course duration"+duration;
    }
}
