package com.project.filters.decorator;

import com.project.filters.base.DisplayableImage;

public abstract class ImageFilterDecorator implements DisplayableImage {
    protected final DisplayableImage image;

    public ImageFilterDecorator(DisplayableImage image) {
        this.image = image;
    }

    @Override
    public void display() {
        image.display();
    }
}