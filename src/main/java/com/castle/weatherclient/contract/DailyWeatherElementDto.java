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
    @JsonProperty("temp.day")
    private float dayTemperature;
    @JsonProperty("temp.min")
    private float minTemperature;
    @JsonProperty("temp.max")
    private float maxTemperature;
    @JsonProperty("temp.night")
    private float nightTemperature;
    @JsonProperty("temp.eve")
    private float eveningTemperature;
    @JsonProperty("temp.morn")
    private float morningTemperature;
    @JsonProperty("feels_like.day")
    private float dayPerceivedTemperature;
    @JsonProperty("feels_like.night")
    private float nightPerceivedTemperature;
    @JsonProperty("feels_like.eve")
    private float eveningPerceivedTemperature;
    @JsonProperty("feels_like.morn")
    private float morningPerceivedTemperature;
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
    @JsonProperty("rain.1h")
    private float rainAmount;
    private float uvi;


}
