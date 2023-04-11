package com.dominikcebula.edu.design.patterns.behavioral.observer.subject;

import com.dominikcebula.edu.design.patterns.behavioral.observer.data.WeatherData;
import com.dominikcebula.edu.design.patterns.behavioral.observer.observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private WeatherData weatherData;
    private final List<WeatherObserver> observers = new ArrayList<>();

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherDatChanged();
    }

    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    private void weatherDatChanged() {
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(weatherData);
        }
    }
}
