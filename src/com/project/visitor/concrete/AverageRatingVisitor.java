package com.project.visitor.concrete;

import com.project.gallery.GalleryImage;
import com.project.visitor.element.AbstractImageVisitor;

import java.util.ArrayList;
import java.util.List;

public class AverageRatingVisitor extends AbstractImageVisitor {
    private final List<Integer> ratings = new ArrayList<>();

    @Override
    public void visit(GalleryImage image) {
        ratings.add(image.getRating());
    }

    public double getAverage() {
        if (ratings.isEmpty()) return 0;
        return ratings.stream().mapToInt(Integer::intValue).average().orElse(0);
    }
}