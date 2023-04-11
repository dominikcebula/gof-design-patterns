package com.dominikcebula.edu.design.patterns.behavioral.observer;

import com.dominikcebula.edu.design.patterns.behavioral.observer.data.Humidity;
import com.dominikcebula.edu.design.patterns.behavioral.observer.data.Pressure;
import com.dominikcebula.edu.design.patterns.behavioral.observer.data.Temperature;
import com.dominikcebula.edu.design.patterns.behavioral.observer.data.WeatherData;
import com.dominikcebula.edu.design.patterns.behavioral.observer.observer.Display;
import com.dominikcebula.edu.design.patterns.behavioral.observer.observer.JsonExporter;
import com.dominikcebula.edu.design.patterns.behavioral.observer.subject.WeatherStation;

import static com.dominikcebula.edu.design.patterns.behavioral.observer.data.units.PressureUnit.hPa;
import static com.dominikcebula.edu.design.patterns.behavioral.observer.data.units.TemperatureUnit.CELSIUS;

class Runner {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        var weatherData1 = new WeatherData(
                new Temperature(15, CELSIUS),
                new Humidity(0.67f),
                new Pressure(989.8f, hPa)
        );
        var weatherData2 = new WeatherData(
                new Temperature(27, CELSIUS),
                new Humidity(0.38f),
                new Pressure(986.7f, hPa)
        );
        var weatherData3 = new WeatherData(
                new Temperature(23, CELSIUS),
                new Humidity(0.65f),
                new Pressure(982.7f, hPa)
        );

        weatherStation.registerObserver(new Display());
        weatherStation.registerObserver(new JsonExporter());

        weatherStation.setWeatherData(weatherData1);
        weatherStation.setWeatherData(weatherData2);
        weatherStation.setWeatherData(weatherData3);
    }
}
