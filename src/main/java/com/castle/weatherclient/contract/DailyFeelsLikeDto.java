package com.castle.weatherclient.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DailyFeelsLikeDto {
    @JsonProperty("day")
    private float dayPerceivedTemperature;
    @JsonProperty("night")
    private float nightPerceivedTemperature;
    @JsonProperty("eve")
    private float eveningPerceivedTemperature;
    @JsonProperty("morn")
    private float morningPerceivedTemperature;
}
