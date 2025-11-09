package com.project.manager;

import com.project.gallery.Image;
import java.util.ArrayList;
import java.util.List;

public class AppManager {
    private static AppManager instance;
    private List<Image> images;

    private AppManager() {
        images = new ArrayList<>();
    }

    public static AppManager getInstance() {
        if (instance == null) {
            instance = new AppManager();
        }
        return instance;
    }

    public void addImage(Image image) {
        images.add(image);
        System.out.println("Image added to AppManager.");
    }

    public List<Image> getImages() {
        return images;
    }
}