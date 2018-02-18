package com.example.java;

public class FakeWeatherStation {

    public static void main(String[] args) {
	// write your code here
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(32, 65, 30.4f);
        weatherData.setMeasurements(16, 12, 10.6f);
        weatherData.setMeasurements(5, 41, 5.7f);

    }
}
