package com.project.sorting.strategy;

import com.project.gallery.GalleryImage;
import java.util.List;

public interface SortStrategy {
    void sort(List<GalleryImage> images);
}