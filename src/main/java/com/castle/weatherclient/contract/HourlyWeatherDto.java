package com.castle.weatherclient.contract;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class HourlyWeatherDto {
    @JsonProperty("hourly")
    private List<HourlyWeatherElementDto> hourlyWeatherElementDtos = new ArrayList<HourlyWeatherElementDto>();
}
