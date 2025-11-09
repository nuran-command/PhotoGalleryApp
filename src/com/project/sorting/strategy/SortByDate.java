package com.project.sorting.strategy;

import com.project.gallery.Image;
import java.util.List;

public class SortByDate implements SortStrategy {
    @Override
    public void sort(List<Image> images) {
        images.sort((a, b) -> a.getDate().compareTo(b.getDate()));
        System.out.println("Images sorted by date.");
    }
}