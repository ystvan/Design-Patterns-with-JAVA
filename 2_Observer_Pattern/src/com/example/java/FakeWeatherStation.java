package com.example.java;

public class FakeWeatherStation {

    public static void main(String[] args) {

        FakeWeatherData fakeWeatherData = new FakeWeatherData();

        System.out.println("Registering observers\n");

        ShowCurrentWeather showLiveData = new ShowCurrentWeather(fakeWeatherData);
        WeatherForecast futureTeller = new WeatherForecast(fakeWeatherData);

        System.out.println("sending measurements to observers\n");

        fakeWeatherData.setMeasurements(32, 65, 30.4f);
        fakeWeatherData.setMeasurements(16, 12, 10.6f);
        fakeWeatherData.setMeasurements(5, 41, 5.7f);

        System.out.println("Removing one of them\n");

        fakeWeatherData.removeObserver(showLiveData);

        System.out.println("sending measurements to observers\n");
        fakeWeatherData.setMeasurements(100, 43, 30.4f);

        System.out.println("Removing another one as well\n");

        fakeWeatherData.removeObserver(futureTeller);

        System.out.println("sending measurements to observers\n");

        fakeWeatherData.setMeasurements(21, 78, 5.4f);
        fakeWeatherData.setMeasurements(41, 73, 10.67f);
        fakeWeatherData.setMeasurements(51, 478, 57.67f);

        System.out.println("Registering new observers\n");

        WeatherForecast newFutureTeller = new WeatherForecast(fakeWeatherData);

        System.out.println("sending measurements to observers again\n");

        fakeWeatherData.setMeasurements(21, 78, 5.4f);
        fakeWeatherData.setMeasurements(41, 73, 10.67f);

    }
}
