package com.project.filters.factory;

import com.project.filters.base.Image;
import com.project.filters.decorator.GrayscaleFilter;
import com.project.filters.decorator.SepiaFilter;

public class FilterFactory {

    public static Image applyFilter(String type, Image image) {
        if (type == null) return image;

        switch (type.toLowerCase()) {
            case "grayscale":
                return new GrayscaleFilter(image);
            case "sepia":
                return new SepiaFilter(image);
            default:
                System.out.println("Unknown filter type. Returning original image.");
                return image;
        }
    }
}