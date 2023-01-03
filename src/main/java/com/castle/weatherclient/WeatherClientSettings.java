package com.castle.weatherclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WeatherClientSettings implements IWeatherClientSettings {

    @Value("https://api.openweathermap.org/")
    private String baseUrl;
    @Value("${OPENWEATHERMAP_API_KEY}")
    private String apiKey;
    @Value("3")
    private String apiVersion;

    @Value("${LOCATION_LATITUDE}")
    private float latitude;
    @Value("${LOCATION_LONGITUDE}")
    private float longitude;

    @Override
    public String getBaseUrl() {
        return baseUrl;
    }

    @Override
    public String getApiVersion() {
        return apiVersion;
    }

    @Override
    public String getApiKey() {
        return apiKey;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }
}
