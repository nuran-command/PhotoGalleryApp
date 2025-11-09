package com.project.filters.decorator;

import com.project.filters.base.Image;

public abstract class ImageFilterDecorator implements Image {
    protected Image image;

    public ImageFilterDecorator(Image image) {
        this.image = image;
    }

    @Override
    public void display() {
        image.display();
    }
}