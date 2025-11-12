package com.project.camera;

public class BasicCamera implements Camera {
    private String photoMessage = "Photo captured!";
    private String videoMessage = "Recording video...";

    @Override
    public void capturePhoto() {
        System.out.println(photoMessage);
    }

    @Override
    public void recordVideo() {
        System.out.println(videoMessage);
    }
}
