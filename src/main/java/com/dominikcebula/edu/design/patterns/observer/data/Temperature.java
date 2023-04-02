package com.dominikcebula.edu.design.patterns.observer.data;

import com.dominikcebula.edu.design.patterns.observer.data.units.TemperatureUnit;

public class Temperature {
    private final float temperature;
    private final TemperatureUnit unit;

    public Temperature(float temperature, TemperatureUnit unit) {
        this.temperature = temperature;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return String.format("%f%s", temperature, unit);
    }
}
