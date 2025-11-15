package com.project.sorting.concrete;

import com.project.gallery.GalleryImage;
import com.project.sorting.strategy.SortStrategy;

import java.util.List;

public class SortByRating implements SortStrategy {
    @Override
    public void sort(List<GalleryImage> images) {
        images.sort((a, b) -> Integer.compare(b.getRating(), a.getRating()));
        System.out.println("Images sorted by rating.");
    }
}