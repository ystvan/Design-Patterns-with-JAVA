package com.example.java;

public class WeatherForecast implements Observer, FakeApplication {
    private float pressureNow = 29.92f;
    private float pressurePrevious;
    private FakeWeatherData fakeWeatherData;

    public WeatherForecast(FakeWeatherData fakeWeatherData) {
        this.fakeWeatherData = fakeWeatherData;
        fakeWeatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        pressurePrevious = pressureNow;
        pressureNow = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.print("\t\tLive weather forecasting: ");
        if (pressureNow > pressurePrevious) {
            System.out.println("\tWatch out, the temperature might be higher very soon!");
        } else if (pressureNow == pressurePrevious) {
            System.out.println("\tNo changes on the way, looks like you better get use to it");
        } else if (pressureNow < pressurePrevious) {
            System.out.println("\tAs it seems, you can expect drop in the temperature very soon!");
        }
    }
}
