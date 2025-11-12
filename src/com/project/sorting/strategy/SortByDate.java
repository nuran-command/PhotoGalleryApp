package com.project.sorting.strategy;

import com.project.gallery.Image;
import java.util.List;

public class SortByDate implements SortStrategy {

    private String sortMessage = "Images sorted by date.";

    @Override
    public void sort(List<Image> images) {
        images.sort((a, b) -> a.getDate().compareTo(b.getDate()));
        System.out.println(sortMessage);
    }
}
