package com.castle.weatherclient.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherDescriptionDto {
    private int id;
    @JsonProperty("main")
    private String mainDescription;
    private String description;
    private String icon;
}
