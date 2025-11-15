package com.project.filters.factory;

import com.project.filters.base.DisplayableImage;
import com.project.filters.decorator.GrayscaleFilter;
import com.project.filters.decorator.SepiaFilter;

public class FilterFactory {

    public static DisplayableImage create(FilterType type, DisplayableImage image) {
        if (type == null) return image;

        return switch (type) {
            case GRAYSCALE -> new GrayscaleFilter(image);
            case SEPIA -> new SepiaFilter(image);
        };
    }
}