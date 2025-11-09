package com.project.sorting.strategy;

import com.project.gallery.Image;
import java.util.List;

public interface SortStrategy {
    void sort(List<Image> images);
}