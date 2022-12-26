package com.castle.weatherclient;

import com.castle.weatherclient.contract.WeatherDto;
import com.castle.weatherclient.contract.WeatherSummaryDto;
import org.springframework.web.util.UriComponentsBuilder;

public interface IWeatherClient {
    WeatherDto getWeatherByUnixTime(Long unixTime);
    WeatherSummaryDto getWeatherSummaryByUnixTime(Long unixTime);

}
