package com.dominikcebula.edu.design.patterns.structural.flyweight.text.component;

import com.dominikcebula.edu.design.patterns.structural.flyweight.text.font.Font;
import com.dominikcebula.edu.design.patterns.structural.flyweight.text.font.FontFactory;

public class TextLabel {
    private static final FontFactory FONT_FACTORY = new FontFactory();

    private final Font font;
    private final String text;

    public TextLabel(String fontName, String text) {
        this.font = FONT_FACTORY.getFont(fontName);
        this.text = text;
    }

    public void render() {
        font.render(text);
    }
}
