package com.project.manager;

import com.project.gallery.GalleryImage;
import java.util.List;

public interface ImageRepository {
    void addImage(GalleryImage image);
    List<GalleryImage> getImages();
}