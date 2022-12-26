package com.castle.weatherclient.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherDto extends WeatherSummaryDto {

    @JsonProperty("current.sunrise")
    private long sunrise;
    @JsonProperty("current.sunset")
    private long sunset;
    @JsonProperty("current.feels_like")
    private float perceivedTemperature;
    @JsonProperty("current.pressure")
    private int pressure;
    @JsonProperty("current.humidity")
    private int humidity;
    @JsonProperty("current.clouds")
    private int cloudiness;
    @JsonProperty("current.wind_speed")
    private float windSpeed;
    @JsonProperty("current.weather.main")
    private String weatherType;
    @JsonProperty("current.weather.description")
    private String weatherDescription;
}
