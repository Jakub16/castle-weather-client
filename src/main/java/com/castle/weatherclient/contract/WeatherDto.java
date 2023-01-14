package com.castle.weatherclient.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class WeatherDto {
    @JsonProperty("lat")
    private float latitude;
    @JsonProperty("lon")
    private float longitude;
    @JsonProperty("current.dt")
    private long unixTime;
    @JsonProperty("current.sunrise")
    private long sunrise;
    @JsonProperty("current.sunset")
    private long sunset;
    @JsonProperty("current.temp")
    private float temperature;
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
    @JsonProperty("current.weather")
    private List<WeatherDescriptionDto> weatherDescription = new ArrayList<WeatherDescriptionDto>();
}
