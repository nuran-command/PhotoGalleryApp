package com.project.camera.facade;

import com.project.camera.*;

public class CameraFacade {
    private Camera camera;
    private String photoProcessMessage = "Facade: Photo process simplified.";
    private String videoProcessMessage = "Facade: Video process simplified.";

    public CameraFacade() {
        this.camera = new BasicCamera();
    }

    public void takePhoto() {
        camera.capturePhoto();
        System.out.println(photoProcessMessage);
    }

    public void recordMovie() {
        camera.recordVideo();
        System.out.println(videoProcessMessage);
    }
}
