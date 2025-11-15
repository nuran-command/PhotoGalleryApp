package com.project.sorting.context;

import com.project.sorting.strategy.*;

import com.project.gallery.GalleryImage;
import java.util.List;

public class ImageSorter {
    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortImages(List<GalleryImage> galleryImages) {
        strategy.sort(galleryImages);
    }
}