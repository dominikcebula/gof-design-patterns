package com.dominikcebula.edu.design.patterns.structural.composite.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private final String name;
    private final List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Directory Name: " + name);
        components.forEach(FileSystemComponent::display);
    }

    @Override
    public int getSizeInBytes() {
        return components.stream()
                .map(FileSystemComponent::getSizeInBytes)
                .reduce(Integer::sum)
                .orElse(0);
    }

    public void add(FileSystemComponent component) {
        components.add(component);
    }

    public void remove(FileSystemComponent component) {
        components.remove(component);
    }
}
