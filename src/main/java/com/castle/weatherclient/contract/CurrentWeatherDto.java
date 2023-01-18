package com.castle.weatherclient.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CurrentWeatherDto {
    @JsonProperty("dt")
    private long unixTime;
    private long sunrise;
    private long sunset;
    @JsonProperty("temp")
    private float temperature;
    @JsonProperty("feels_like")
    private float perceivedTemperature;
    private int pressure;
    private int humidity;
    @JsonProperty("clouds")
    private int cloudiness;
    private float windSpeed;
    @JsonProperty("weather")
    private List<WeatherDescriptionDto> weatherDescription = new ArrayList<WeatherDescriptionDto>();
}
