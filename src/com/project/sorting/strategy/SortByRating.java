package com.project.sorting.strategy;

import com.project.gallery.Image;
import java.util.List;

public class SortByRating implements SortStrategy {
    @Override
    public void sort(List<Image> images) {
        images.sort((a, b) -> Integer.compare(b.getRating(), a.getRating()));
        System.out.println("Images sorted by rating.");
    }
}
