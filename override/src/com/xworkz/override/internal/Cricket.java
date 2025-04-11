package com.xworkz.override.internal;

public class Cricket extends Sport{
    public Cricket() {
        System.out.println("Cricket: Constructor is running");
    }

    @Override
    public void play() {
        System.out.println("Cricket: Playing a cricket match");
    }

    public void bowl() {
        System.out.println("Cricket: Bowling to the batsman");
    }

    public void bat() {
        System.out.println("Cricket: Batting and scoring runs");
    }
}
