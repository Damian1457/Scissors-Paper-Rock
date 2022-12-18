package com.example.junit_testing.weather.controller;

import com.example.junit_testing.weather.interfacee.Temperatures;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuit {

    @Mock
    private Temperatures temperaturesMock;
    Map<String, Double> temperaturesMap = new HashMap<>();

    @BeforeEach
    void setUp() {
        temperaturesMap.put("Rzeszów", 25.5);
        temperaturesMap.put("Kraków", 26.2);
        temperaturesMap.put("Wrocław", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdańsk", 26.1);
    }

    @Test
    void testCalculateForecastWithStub() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        //When
        int quantityOfSensor = weatherForecast.getTemperatures().size();

        //Then
        assertEquals(5, quantityOfSensor);
    }

    @Test
    void testCalculateAverageTemperature() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(weatherForecast.getTemperatures()).thenReturn(temperaturesMap);

        //When
        double averageMethod = weatherForecast.getAverageTemperature();

        //Then
        assertEquals(averageMethod, 25.56, 0);
    }

    @Test
    void testCalculateMedianeTemperature() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(weatherForecast.getTemperatures()).thenReturn(temperaturesMap);

        //When
        double medianeMethod = weatherForecast.getMedianeTemperature();

        //Then
        assertEquals(medianeMethod, 25.5, 0);
    }
}
