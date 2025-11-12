package com.project.filters.decorator;

import com.project.filters.base.Image;

public class GrayscaleFilter extends ImageFilterDecorator {

    private String filterMessage = "Applying Grayscale Filter";

    public GrayscaleFilter(Image image) {
        super(image);
    }

    @Override
    public void display() {
        super.display();
        System.out.println(filterMessage);
    }
}
