package com.dominikcebula.edu.design.patterns.observer.data;

import com.dominikcebula.edu.design.patterns.observer.data.units.PressureUnit;

public class Pressure {
    private final float pressure;
    private final PressureUnit pressureUnit;

    public Pressure(float pressure, PressureUnit pressureUnit) {
        this.pressure = pressure;
        this.pressureUnit = pressureUnit;
    }

    public float getPressure() {
        return pressure;
    }

    public PressureUnit getPressureUnit() {
        return pressureUnit;
    }

    @Override
    public String toString() {
        return String.format("%.1f %s", pressure, pressureUnit);
    }
}
