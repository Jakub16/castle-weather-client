package com.castle.weatherclient;

import com.castle.weatherclient.contract.WeatherDto;
import com.castle.weatherclient.contract.WeatherSummaryDto;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(MockitoJUnitRunner.class)
class WeatherClientTests {

    @Mock
    WeatherClientSettings weatherClientSettings;
    @Mock
    WeatherClient weatherClient;
    @InjectMocks
    WeatherDto weatherDto;
    @InjectMocks
    WeatherSummaryDto weatherSummaryDto;

    @Before
    void setUp() {
        WeatherDto weatherDtoInstance;

        Mockito.when(weatherClient.getWeatherByUnixTime(1785L)).thenReturn(weatherDto);
    }

    @Test
    void getWeatherFromUnixTimeShouldReturnProperWeatherDtoObject() {
    }

}
