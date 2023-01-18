package com.castle.weatherclient.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DailyTemperatureDto {
    @JsonProperty("day")
    private float dayTemperature;
    @JsonProperty("min")
    private float minTemperature;
    @JsonProperty("max")
    private float maxTemperature;
    @JsonProperty("night")
    private float nightTemperature;
    @JsonProperty("eve")
    private float eveningTemperature;
    @JsonProperty("morn")
    private float morningTemperature;
}
