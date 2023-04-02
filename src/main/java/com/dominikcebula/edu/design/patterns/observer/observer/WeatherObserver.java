package com.dominikcebula.edu.design.patterns.observer.observer;

import com.dominikcebula.edu.design.patterns.observer.data.WeatherData;

public interface WeatherObserver {
    void update(WeatherData weatherData);
}
