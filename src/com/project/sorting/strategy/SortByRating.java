package com.project.sorting.strategy;

import com.project.gallery.Image;
import java.util.List;

public class SortByRating implements SortStrategy {

    private String sortMessage = "Images sorted by rating.";

    @Override
    public void sort(List<Image> images) {
        images.sort((a, b) -> Integer.compare(b.getRating(), a.getRating()));
        System.out.println(sortMessage);
    }
}
