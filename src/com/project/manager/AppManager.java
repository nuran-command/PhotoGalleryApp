package com.project.manager;

import com.project.gallery.GalleryImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppManager implements ImageRepository {
    private static final AppManager INSTANCE = new AppManager();
    private final List<GalleryImage> images = new ArrayList<>();

    private AppManager() {}

    public static AppManager getInstance() { return INSTANCE; }

    @Override
    public void addImage(GalleryImage image) {
        images.add(image);
        System.out.println("AppManager: Image added to repository.");
    }

    @Override
    public List<GalleryImage> getImages() {
        return Collections.unmodifiableList(images);
    }
}