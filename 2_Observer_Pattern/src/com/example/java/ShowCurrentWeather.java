package com.example.java;

public class ShowCurrentWeather implements Observer, FakeApplication {
    private float temperature;
    private float humidity;
    private Subject fakeWeatherData;

    public ShowCurrentWeather(Subject fakeWeatherData) {
        this.fakeWeatherData = fakeWeatherData;
        fakeWeatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("\tCurrent weather is " + temperature + " Celsius degrees " + "\n"
                            + humidity + " % humidity \n ");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
