package com.dominikcebula.edu.design.patterns.structural.flyweight.text.font;

class ArialFont implements Font {
    ArialFont() {
        System.out.println("Creating Arial Font");
    }

    @Override
    public void render(String text) {
        System.out.println("Rendering using Arial Font: " + text);
    }
}
