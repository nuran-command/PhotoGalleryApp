package com.project.camera.facade;

import com.project.camera.*;

public class CameraFacade {
    private Camera camera;

    public CameraFacade() {
        this.camera = new BasicCamera();
    }

    public void takePhoto() {
        camera.capturePhoto();
        System.out.println("Facade: Photo process simplified.");
    }

    public void recordMovie() {
        camera.recordVideo();
        System.out.println("Facade: Video process simplified.");
    }
}