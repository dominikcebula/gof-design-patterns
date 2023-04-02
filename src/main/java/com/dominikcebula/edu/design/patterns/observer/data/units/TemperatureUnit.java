package com.dominikcebula.edu.design.patterns.observer.data.units;

public enum TemperatureUnit {
    CELSIUS("°C");

    private final String symbol;

    TemperatureUnit(String symbol) {
        this.symbol = symbol;
    }


    @Override
    public String toString() {
        return symbol;
    }
}
