package com.dominikcebula.edu.design.patterns.structural.composite;

import com.dominikcebula.edu.design.patterns.structural.composite.filesystem.Directory;
import com.dominikcebula.edu.design.patterns.structural.composite.filesystem.File;

public class Runner {
    public static void main(String[] args) {
        Directory directory1 = new Directory("directory1");
        Directory directory2 = new Directory("directory2");

        File file1 = new File("file1", 100);
        File file2 = new File("file2", 200);
        directory1.add(file1);
        directory1.add(file2);

        File file3 = new File("file3", 300);
        File file4 = new File("file4", 400);
        directory2.add(file3);
        directory2.add(file4);

        directory1.add(directory2);

        System.out.println("Displaying directory1");
        directory1.display();
        System.out.println();

        System.out.println("Displaying file1");
        file1.display();
        System.out.println();

        System.out.println("Size in bytes for directory1 = " + directory1.getSizeInBytes());
        System.out.println("Size in bytes for file1 = " + file1.getSizeInBytes());
    }
}
