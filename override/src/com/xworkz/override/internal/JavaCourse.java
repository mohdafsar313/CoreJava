package com.xworkz.override.internal;

import java.util.jar.JarEntry;

public class JavaCourse extends Course
{
    public JavaCourse() {
        System.out.println("JavaCourse: Constructor is running");
    }

    @Override
    public void start() {
        System.out.println("JavaCourse: Starting Java programming course");
    }

    public void compileCode() {
        System.out.println("JavaCourse: Compiling Java code");
    }

    public void runCode() {
        System.out.println("JavaCourse: Running Java code");
    }
}
