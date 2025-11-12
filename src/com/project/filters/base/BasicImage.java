package com.project.filters.base;

public class BasicImage implements Image {
    private String displayMessage = "Displaying original image";

    @Override
    public void display() {
        System.out.println(displayMessage);
    }
}
