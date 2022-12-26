package com.castle.weatherclient.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherSummaryDto {

    @JsonProperty("lat")
    private float latitude;
    @JsonProperty("lon")
    private float longitude;
    @JsonProperty("current.dt")
    private long unixTime;
    @JsonProperty("current.temp")
    private float temperature;
    @JsonProperty("current.weather.icon")
    private String weatherIconId;

}
