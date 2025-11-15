package com.project.gallery;

import java.time.LocalDate;
import com.project.visitor.ImageVisitor;

public class GalleryImage {
    private String name;
    private LocalDate date;
    private int rating;

    public GalleryImage(String name, LocalDate date, int rating) {
        this.name = name;
        this.date = date;
        this.rating = rating;
    }

    public String getName() { return name; }
    public LocalDate getDate() { return date; }
    public int getRating() { return rating; }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void accept(ImageVisitor visitor) {
        visitor.visit(this);
    }

    public void displayInfo() {
        System.out.println("Image: " + name + ", Date: " + date + ", Rating: " + rating);
    }
}