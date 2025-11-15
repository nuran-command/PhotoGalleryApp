package com.project.camera.facade;

import com.project.camera.BasicCamera;
import com.project.camera.Camera;
import com.project.camera.subsystem.FocusSystem;
import com.project.camera.subsystem.FlashSystem;
import com.project.camera.subsystem.StorageSystem;
import com.project.util.Log;

public class CameraFacade {
    private final Camera camera;
    private final FocusSystem focusSystem;
    private final FlashSystem flashSystem;
    private final StorageSystem storageSystem;

    public CameraFacade() {
        this.camera = new BasicCamera();
        this.focusSystem = new FocusSystem();
        this.flashSystem = new FlashSystem();
        this.storageSystem = new StorageSystem();
    }

    public void takePhoto(String name) {
        focusSystem.autoFocus();
        flashSystem.enable();
        camera.capturePhoto();
        storageSystem.save(name);
        Log.info("Facade: Photo process simplified.");
    }

    public void recordMovie() {
        camera.recordVideo();
        Log.info("Facade: Video process simplified.");
    }
}