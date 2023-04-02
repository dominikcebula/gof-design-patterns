package com.dominikcebula.edu.design.patterns.observer.observer;

import com.dominikcebula.edu.design.patterns.observer.data.WeatherData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonExporter implements WeatherObserver {
    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public void update(WeatherData weatherData) {
        try {
            String weatherDataJson = mapper.writeValueAsString(weatherData);

            System.out.println("JSON: Weather data  = " + weatherDataJson);
        } catch (JsonProcessingException e) {
            throw new IllegalStateException("Unable to convert weather data to json", e);
        }
    }
}
