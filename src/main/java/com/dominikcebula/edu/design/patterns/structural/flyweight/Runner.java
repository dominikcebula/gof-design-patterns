package com.dominikcebula.edu.design.patterns.structural.flyweight;

import com.dominikcebula.edu.design.patterns.structural.flyweight.text.component.TextLabel;

public class Runner {
    public static void main(String[] args) {
        TextLabel textLabel1 = new TextLabel("Arial", "Hello One!");
        TextLabel textLabel2 = new TextLabel("Arial", "Hello Two!");
        TextLabel textLabel3 = new TextLabel("Arial", "Hello Three!");

        TextLabel textLabel4 = new TextLabel("Times New Roman", "Hello Four!");
        TextLabel textLabel5 = new TextLabel("Times New Roman", "Hello Five!");

        textLabel1.render();
        textLabel2.render();
        textLabel3.render();
        textLabel4.render();
        textLabel5.render();
    }
}
