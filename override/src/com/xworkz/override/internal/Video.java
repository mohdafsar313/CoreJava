package com.xworkz.override.internal;

public class Video extends Media{
    public Video() {
        System.out.println("Video: Constructor is running");
    }

    @Override
    public void play() {
        System.out.println("Video: Playing video file");
    }

    public void pause() {
        System.out.println("Video: Pausing playback");
    }

    public void stop() {
        System.out.println("Video: Stopping playback");
    }
}
