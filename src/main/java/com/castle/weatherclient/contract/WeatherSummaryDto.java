package com.castle.weatherclient.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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
    @JsonProperty("current.weather")
    private List<WeatherDescriptionDto> weatherDescription = new ArrayList<WeatherDescriptionDto>();
}
