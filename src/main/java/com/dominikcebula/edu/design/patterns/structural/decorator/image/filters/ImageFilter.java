package com.dominikcebula.edu.design.patterns.structural.decorator.image.filters;

import com.dominikcebula.edu.design.patterns.structural.decorator.image.Image;

abstract class ImageFilter implements Image {
    protected Image image;

    public ImageFilter(Image image) {
        this.image = image;
    }

    @Override
    public void display() {
        image.display();
    }
}
