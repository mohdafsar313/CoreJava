package com.xworkz.override.internal;

public class Movie extends Entertainment{
    public Movie() {
        System.out.println("Movie: Constructor is running");
    }

    @Override
    public void enjoy() {
        System.out.println("Movie: Watching a feature film");
    }

    public void playTrailer() {
        System.out.println("Movie: Playing the trailer");
    }

    public void showCredits() {
        System.out.println("Movie: Showing end credits");
    }
}
