package com.dominikcebula.edu.design.patterns.structural.composite.filesystem;

public class File implements FileSystemComponent {
    private final String name;
    private final int sizeInBytes;

    public File(String name, int sizeInBytes) {
        this.name = name;
        this.sizeInBytes = sizeInBytes;
    }

    @Override
    public void display() {
        System.out.println("File Name: " + name);
    }

    @Override
    public int getSizeInBytes() {
        return sizeInBytes;
    }
}
