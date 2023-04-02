package com.dominikcebula.edu.design.patterns.observer.data;

import com.dominikcebula.edu.design.patterns.observer.data.units.PressureUnit;

public class Pressure {
    private final float pressure;
    private final PressureUnit pressureUnit;

    public Pressure(float pressure, PressureUnit pressureUnit) {
        this.pressure = pressure;
        this.pressureUnit = pressureUnit;
    }

    @Override
    public String toString() {
        return String.format("%f %s", pressure, pressureUnit);
    }
}
