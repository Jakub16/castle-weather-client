package com.castle.weatherclient;

import com.castle.weatherclient.contract.DailyWeatherDto;
import com.castle.weatherclient.contract.HourlyWeatherDto;
import com.castle.weatherclient.contract.WeatherDto;

public interface IWeatherClient {
    WeatherDto getCurrentWeather();
    HourlyWeatherDto getHourlyWeather();
    DailyWeatherDto getDailyWeather();

}
