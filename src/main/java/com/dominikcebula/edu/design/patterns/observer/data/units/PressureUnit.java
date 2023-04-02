package com.dominikcebula.edu.design.patterns.observer.data.units;

public enum PressureUnit {
    hPa("hPa");

    private final String symbol;

    PressureUnit(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
