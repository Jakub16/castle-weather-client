package com.castle.weatherclient.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class DailyWeatherDto {

    @JsonProperty("daily")
    private List<DailyWeatherElementDto> dailyWeatherElements = new ArrayList<DailyWeatherElementDto>();
}
