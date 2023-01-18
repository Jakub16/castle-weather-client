package com.castle.weatherclient.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class DailyWeatherElementDto {
    @JsonProperty("dt")
    private long unixTime;
    @JsonProperty("sunrise")
    private long sunrise;
    @JsonProperty("sunset")
    private long sunset;
    @JsonProperty("temp")
    private DailyTemperatureDto dailyTemperatureDto;
    @JsonProperty("feels_like")
    private DailyFeelsLikeDto dailyFeelsLikeDto;
    @JsonProperty("pressure")
    private int pressure;
    @JsonProperty("humidity")
    private int humidity;
    @JsonProperty("wind_speed")
    private float windSpeed;
    @JsonProperty("weather")
    private List<WeatherDescriptionDto> weatherDescription = new ArrayList<WeatherDescriptionDto>();
    @JsonProperty("clouds")
    private int cloudiness;
    @JsonProperty("pop")
    private float probabilityOfPrecipitation;
    @JsonProperty("rain")
    private float rainAmount;
    private float uvi;


}
