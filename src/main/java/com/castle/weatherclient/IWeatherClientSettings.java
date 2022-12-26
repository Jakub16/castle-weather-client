package com.castle.weatherclient;

import org.springframework.web.util.UriComponentsBuilder;

public interface IWeatherClientSettings {
    String getBaseUrl();
    String getApiVersion();
    String getApiKey();
    float getLatitude();
    float getLongitude();

    default UriComponentsBuilder getUriComponentsBuilder() {
        return UriComponentsBuilder.newInstance()
                .scheme("https")
                .host(getBaseUrl())
                .pathSegment("data")
                .pathSegment(getApiVersion())
                .path("onecall");
    }
}
