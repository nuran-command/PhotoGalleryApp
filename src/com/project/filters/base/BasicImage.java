package com.project.filters.base;

public class BasicImage implements Image {
    @Override
    public void display() {
        System.out.println("Displaying original image");
    }
}