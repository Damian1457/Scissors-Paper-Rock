package com.example.junit_testing.weather2tests;

import com.example.junit_testing.weather2.Temperatures;
import com.example.junit_testing.weather2.TemperaturesStub;
import com.example.junit_testing.weather2.WeatherForecast;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuites {

    @BeforeEach
    void before() {
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
    }

    @Mock
    private Temperatures temperatures;
    Map<String, Double> temperaturesMap = new HashMap<>();

    @Test
    void calculateForecastTestStub() {
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantity = weatherForecast.calculateForecast().size();

        //Then
        assertEquals(5, quantity);
    }

    @Test
    void testCalculateForecastWitMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        when(temperatures.getTemperatures()).thenReturn(temperaturesMap);

        //When
        int quantity = weatherForecast.calculateForecast().size();

        //Then
        assertEquals(5, quantity);
    }

    @Test
    void testCalculateAverageWitMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        when(temperatures.getTemperatures()).thenReturn(temperaturesMap);

        //When
        double average = weatherForecast.calculateTheTemperturesAverage();
        System.out.println(average);

        //Then
        assertEquals(25.56, average, 0);
    }

    @Test
    void testcalculateMediane() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);
        when(temperatures.getTemperatures()).thenReturn(temperaturesMap);

        //When
        double medianaValue = weatherForecast.calculateMedianeOfTemperatures();

        //Then
        assertEquals(25.5, medianaValue, 0);
    }
}
