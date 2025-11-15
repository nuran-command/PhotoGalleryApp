package com.project.filters.decorator;

import com.project.filters.base.DisplayableImage;

public class SepiaFilter extends ImageFilterDecorator {

    public SepiaFilter(DisplayableImage image) {
        super(image);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Applying Sepia Filter");
    }
}