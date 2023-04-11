package com.dominikcebula.edu.design.patterns.behavioral.observer.observer;

import com.dominikcebula.edu.design.patterns.behavioral.observer.data.WeatherData;

public interface WeatherObserver {
    void update(WeatherData weatherData);
}
