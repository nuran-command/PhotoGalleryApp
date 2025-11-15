
package com.project.sorting.concrete;

import com.project.gallery.GalleryImage;
import com.project.sorting.strategy.SortStrategy;

import java.util.List;

public class SortByDate implements SortStrategy {
    @Override
    public void sort(List<GalleryImage> images) {
        images.sort((a, b) -> a.getDate().compareTo(b.getDate()));
        System.out.println("Images sorted by date.");
    }
}