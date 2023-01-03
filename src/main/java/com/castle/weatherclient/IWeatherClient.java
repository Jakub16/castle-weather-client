package com.castle.weatherclient;

import com.castle.weatherclient.contract.WeatherDto;
import com.castle.weatherclient.contract.WeatherSummaryDto;

public interface IWeatherClient {
    WeatherDto getCurrentWeather();
    WeatherSummaryDto getCurrentWeatherSummary();

}
