package com.castle.weatherclient.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class HourlyWeatherElementDto {

    @JsonProperty("dt")
    private long unixTime;
    @JsonProperty("temp")
    private float temperature;
    @JsonProperty("feels_like")
    private float perceivedTemperature;
    @JsonProperty("pressure")
    private int pressure;
    @JsonProperty("humidity")
    private int humidity;
    private float uvi;
    @JsonProperty("clouds")
    private int cloudiness;
    @JsonProperty("wind_speed")
    private float windSpeed;
    @JsonProperty("weather")
    private List<WeatherDescriptionDto> weatherDescriptionDtos = new ArrayList<WeatherDescriptionDto>();
    @JsonProperty("pop")
    private float probabilityOfPrecipitation;
    @JsonProperty("rain")
    private HourlyRainDto hourlyRainDto;
}
