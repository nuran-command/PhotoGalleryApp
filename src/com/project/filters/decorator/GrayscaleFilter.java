package com.project.filters.decorator;

import com.project.filters.base.DisplayableImage;

public class GrayscaleFilter extends ImageFilterDecorator {

    public GrayscaleFilter(DisplayableImage image) {
        super(image);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Applying Grayscale Filter");
    }
}