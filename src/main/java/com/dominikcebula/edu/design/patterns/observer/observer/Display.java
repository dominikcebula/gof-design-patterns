package com.dominikcebula.edu.design.patterns.observer.observer;

import com.dominikcebula.edu.design.patterns.observer.data.WeatherData;

public class Display implements WeatherObserver {
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("Display: Weather data changed to temperature = " + weatherData.getTemperature() + ", humidity = " + weatherData.getHumidity() + ", pressure = " + weatherData.getPressure());
    }
}
