package com.xworkz.override.internal;

public class Game {
    private String name;
    private String type;
    public Game(String name, String type) {
        System.out.println("Game: Constructor is running");
    }

    public void start() {
        System.out.println("Game: Starting a generic game");
    }
    @Override
    public String toString() {
        return "game name"+name+", type"+type;
    }
}
