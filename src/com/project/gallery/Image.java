package com.project.gallery;

import java.time.LocalDate;

public class Image {
    private String name;
    private LocalDate date;
    private int rating;

    public Image(String name, LocalDate date, int rating) {
        this.name = name;
        this.date = date;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getRating() {
        return rating;
    }

    public void displayInfo() {
        System.out.println("Image: " + name + ", Date: " + date + ", Rating: " + rating);
    }
}