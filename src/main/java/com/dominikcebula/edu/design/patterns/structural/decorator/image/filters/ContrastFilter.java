package com.dominikcebula.edu.design.patterns.structural.decorator.image.filters;

import com.dominikcebula.edu.design.patterns.structural.decorator.image.Image;

public class ContrastFilter extends ImageFilter {
    public ContrastFilter(Image image) {
        super(image);
    }

    @Override
    public void display() {
        System.out.println("Applying contrast filter");
        super.display();
    }
}
