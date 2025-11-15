package com.project.camera;

public class BasicCamera implements Camera {
    @Override
    public void capturePhoto() {
        System.out.println("BasicCamera: Photo captured!");
    }

    @Override
    public void recordVideo() {
        System.out.println("BasicCamera: Recording video...");
    }
}