package com.project.filters.decorator;

import com.project.filters.base.Image;

public class SepiaFilter extends ImageFilterDecorator {

    private String filterMessage = "Applying Sepia Filter";

    public SepiaFilter(Image image) {
        super(image);
    }

    @Override
    public void display() {
        super.display();
        System.out.println(filterMessage);
    }
}
