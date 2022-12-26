package com.castle.weatherclient;

import com.castle.weatherclient.contract.WeatherDto;
import com.castle.weatherclient.contract.WeatherSummaryDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class WeatherClient implements IWeatherClient{

    private final RestTemplate restTemplate;
    private final String baseUrl;
    private final String apiVersion;
    private final String apiKey;
    private final float latitude;
    private final float longitude;
    private final IWeatherClientSettings weatherClientSettings;

    public WeatherClient(IWeatherClientSettings weatherClientSettings) {
        this.restTemplate = new RestTemplate();
        this.baseUrl = weatherClientSettings.getBaseUrl();
        this.apiVersion = weatherClientSettings.getApiVersion();
        this.apiKey = weatherClientSettings.getApiKey();
        this.latitude = weatherClientSettings.getLatitude();
        this.longitude = weatherClientSettings.getLongitude();
        this.weatherClientSettings = weatherClientSettings;
    }
    @Override
    public WeatherDto getWeatherByUnixTime(Long unixTime) {
        var uri = weatherClientSettings.getUriComponentsBuilder()
                .queryParam("lat", latitude)
                .queryParam("lon", longitude)
                .queryParam("exclude", "minutely,hourly,daily,alerts")
                .queryParam("appid", apiKey)
                .build()
                .toUriString();

        return restTemplate.getForObject(uri, WeatherDto.class);
    }

    @Override
    public WeatherSummaryDto getWeatherSummaryByUnixTime(Long unixTime) {
        var uri = weatherClientSettings.getUriComponentsBuilder()
                .queryParam("lat", latitude)
                .queryParam("lon", longitude)
                .queryParam("exclude", "minutely,hourly,daily,alerts")
                .queryParam("appid", apiKey)
                .build()
                .toUriString();

        return restTemplate.getForObject(uri, WeatherSummaryDto.class);
    }
}
