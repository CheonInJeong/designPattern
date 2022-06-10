package com.example.designPattern.Observer;

import com.example.designPattern.Observer.display.CurrentConditionsDisplay;

public class ObserverSimulator {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(30,65, 30.4f);
    }
}
