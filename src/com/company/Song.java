package com.company;

public class Song {

    private String Title;
    private double Duration;

    public Song(String title) {
        Title = title;
    }

    public Song(String title, double duration) {
        Title = title;
        Duration = duration;
    }

    public String getTitle() {
        return Title;
    }

    public double getDuration() {
        return Duration;
    }

    @Override
    public String toString() {
        return this.Title + ": " + this.Duration;
    }
}
