package com.dominikcebula.edu.design.patterns.structural.decorator.image.filters;

import com.dominikcebula.edu.design.patterns.structural.decorator.image.Image;

public class SaturationFilter extends ImageFilter {
    public SaturationFilter(Image image) {
        super(image);
    }

    @Override
    public void display() {
        System.out.println("Applying saturation filter");
        super.display();
    }
}