package com.dominikcebula.edu.design.patterns.structural.flyweight.text.font;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {
    private final Map<String, Font> fontCache = new HashMap<>();

    public Font getFont(String fontName) {
        Font font = fontCache.get(fontName);
        if (font == null) {
            font = switch (fontName) {
                case "Arial" -> new ArialFont();
                case "Times New Roman" -> new TimesNewRomanFont();
                default -> throw new IllegalStateException("Unable to create font " + fontName);
            };
            fontCache.put(fontName, font);
        }
        return font;
    }
}
