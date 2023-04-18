package com.dominikcebula.edu.design.patterns.structural.flyweight.text.font;

class TimesNewRomanFont implements Font {
    TimesNewRomanFont() {
        System.out.println("Creating Times New Roman Font");
    }

    @Override
    public void render(String text) {
        System.out.println("Rendering using Times New Roman Font: " + text);
    }
}
