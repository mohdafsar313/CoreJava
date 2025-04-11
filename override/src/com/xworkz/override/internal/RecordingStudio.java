package com.xworkz.override.internal;

public class RecordingStudio extends Studio{
    public RecordingStudio() {
        System.out.println("RecordingStudio: Constructor is running");
    }

    @Override
    public void produce() {
        System.out.println("RecordingStudio: Recording and mixing music tracks");
    }

    public void setupMicrophones() {
        System.out.println("RecordingStudio: Setting up microphones for vocals");
    }

    public void mixAudio() {
        System.out.println("RecordingStudio: Mixing audio with effects");
    }
}
