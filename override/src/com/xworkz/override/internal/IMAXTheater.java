package com.xworkz.override.internal;

public class IMAXTheater extends Theater{
    public IMAXTheater() {
        System.out.println("IMAXTheater: Constructor is running");
    }

    @Override
    public void playMovie() {
        System.out.println("IMAXTheater: Playing movie in IMAX ultra-HD format");
    }

    public void enableSurroundSound() {
        System.out.println("IMAXTheater: Enabling immersive surround sound");
    }

    public void adjustScreenSize() {
        System.out.println("IMAXTheater: Adjusting screen size for panoramic viewing");
    }
}
