package com.example.junit_testing.weather.controller;

import com.example.junit_testing.weather.interfacee.Temperatures;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class WeatherForecastTest {

    @Test
    void testCalculateForecastWithStub() {
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensor = weatherForecast.getTemperatures().size();

        //Then
        assertEquals(5, quantityOfSensor);
    }
}