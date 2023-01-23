package com.castle.weatherclient;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class WeatherClientSettings implements IWeatherClientSettings {

    @Value("${openweathermap.base.url}")
    private String baseUrl;
    @Value("${openweathermap.api.key}")
    private String apiKey;
    @Value("3.0")
    private String apiVersion;
    @Value("${openweathermap.location.latitude}")
    private String latitude;
    @Value("${openweathermap.location.longitude}")
    private String longitude;
}
