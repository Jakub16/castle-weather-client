package com.castle.weatherclient;

public class Main {
    public static void main(String[] args) {
        IWeatherClientSettings weatherClientSettings = new WeatherClientSettings();
        IWeatherClient weatherClient = new WeatherClient(weatherClientSettings);

        var weather = weatherClient.getCurrentWeather();
    }
}
