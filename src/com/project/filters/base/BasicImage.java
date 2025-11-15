package com.project.filters.base;

public class BasicImage implements DisplayableImage {
    private final String name;

    public BasicImage() { this.name = "unnamed"; }
    public BasicImage(String name) { this.name = name; }

    @Override
    public void display() {
        System.out.println("Displaying original image: " + name);
    }

    public String getName() { return name; }
}