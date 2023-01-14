package com.castle.weatherclient;

import com.castle.weatherclient.contract.WeatherDto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CastleWeatherClientApplication {
    private static IWeatherClient weatherClient;

    public CastleWeatherClientApplication(IWeatherClient weatherClient) {
        this.weatherClient = weatherClient;
    }

    public static void main(String[] args) {
        SpringApplication.run(CastleWeatherClientApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        var weatherDto = weatherClient.getCurrentWeather();
//        int cloudiness = weatherDto.getCloudiness();
//    }

}
