package com.castle.weatherclient;

import com.castle.weatherclient.contract.DailyWeatherDto;
import com.castle.weatherclient.contract.HourlyWeatherDto;
import com.castle.weatherclient.contract.WeatherDto;
import com.castle.weatherclient.contract.WeatherSummaryDto;

import java.util.List;

public interface IWeatherClient {
    WeatherDto getCurrentWeather();
    WeatherSummaryDto getCurrentWeatherSummary();
    HourlyWeatherDto getHourlyWeather();
    DailyWeatherDto getDailyWeather();

}
