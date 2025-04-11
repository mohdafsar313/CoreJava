package com.xworkz.override.internal;

public class VideoGame extends Game{
    public VideoGame() {
        System.out.println("VideoGame: Constructor is running");
    }

    @Override
    public void start() {
        System.out.println("VideoGame: Booting up the digital world");
    }

    public void saveProgress() {
        System.out.println("VideoGame: Saving current game progress");
    }

    public void loadLevel() {
        System.out.println("VideoGame: Loading next level");
    }
}
