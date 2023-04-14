package com.dominikcebula.edu.design.patterns.structural.decorator;

import com.dominikcebula.edu.design.patterns.structural.decorator.image.FileImage;
import com.dominikcebula.edu.design.patterns.structural.decorator.image.Image;
import com.dominikcebula.edu.design.patterns.structural.decorator.image.filters.BrightnessFilter;
import com.dominikcebula.edu.design.patterns.structural.decorator.image.filters.ContrastFilter;
import com.dominikcebula.edu.design.patterns.structural.decorator.image.filters.SaturationFilter;

public class Runner {
    public static void main(String[] args) {
        Image image = new FileImage("image.jpg");

        Image filteredImage1 = new SaturationFilter(new ContrastFilter(new BrightnessFilter(image)));

        Image filteredImage2 = new ContrastFilter(new BrightnessFilter(image));

        filteredImage1.display();
        filteredImage2.display();
    }
}
