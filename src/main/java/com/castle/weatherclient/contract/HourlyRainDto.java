package com.castle.weatherclient.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HourlyRainDto {
    @JsonProperty("1h")
    private float HourlyRainAmount;
}
