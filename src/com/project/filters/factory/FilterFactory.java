package com.project.filters.factory;

import com.project.filters.base.Image;
import com.project.filters.decorator.GrayscaleFilter;
import com.project.filters.decorator.SepiaFilter;

public class FilterFactory {

    private static final String GRAYSCALE = "grayscale";
    private static final String SEPIA = "sepia";
    private static final String UNKNOWN_FILTER_MESSAGE = "Unknown filter type. Returning original image.";

    public static Image applyFilter(String type, Image image) {
        if (type == null) return image;

        switch (type.toLowerCase()) {
            case GRAYSCALE:
                return new GrayscaleFilter(image);
            case SEPIA:
                return new SepiaFilter(image);
            default:
                System.out.println(UNKNOWN_FILTER_MESSAGE);
                return image;
        }
    }
}
