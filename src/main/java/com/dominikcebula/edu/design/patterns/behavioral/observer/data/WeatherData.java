package com.dominikcebula.edu.design.patterns.behavioral.observer.data;

public class WeatherData {
    private final Temperature temperature;
    private final Humidity humidity;
    private final Pressure pressure;

    public WeatherData(Temperature temperature, Humidity humidity, Pressure pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public Humidity getHumidity() {
        return humidity;
    }

    public Pressure getPressure() {
        return pressure;
    }
}
