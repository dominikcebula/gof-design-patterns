package com.dominikcebula.edu.design.patterns.observer.data;

public class Humidity {
    private float humidity;

    public Humidity(float humidity) {
        if (humidity < 0 || humidity > 1)
            throw new IllegalStateException("Humidity must be between 0 and 1");

        this.humidity = humidity;
    }

    public float getHumidity() {
        return humidity;
    }

    @Override
    public String toString() {
        return String.format("%d%c", (int) (humidity * 100), '%');
    }
}
