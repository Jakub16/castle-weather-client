package com.castle.weatherclient.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherDto {
    @JsonProperty("lat")
    private float latitude;
    @JsonProperty("lon")
    private float longitude;
    @JsonProperty("current")
    private CurrentWeatherDto currentWeatherDto;
}
