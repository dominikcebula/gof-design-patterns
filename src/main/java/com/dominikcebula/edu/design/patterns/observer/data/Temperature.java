package com.dominikcebula.edu.design.patterns.observer.data;

import com.dominikcebula.edu.design.patterns.observer.data.units.TemperatureUnit;

public class Temperature {
    private final int temperature;
    private final TemperatureUnit unit;

    public Temperature(int temperature, TemperatureUnit unit) {
        this.temperature = temperature;
        this.unit = unit;
    }

    public int getTemperature() {
        return temperature;
    }

    public TemperatureUnit getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return String.format("%d%s", temperature, unit);
    }
}
