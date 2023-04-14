package com.dominikcebula.edu.design.patterns.structural.decorator.image;

public class FileImage implements Image {
    private final String fileName;

    public FileImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
