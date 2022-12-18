package com.example.junit_testing.weather.controller;

import com.example.junit_testing.weather.interfacee.Temperatures;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> getTemperatures() {
        Map<String, Double> temperature = new HashMap<>();
        for (Map.Entry<String, Double> temperaturess : temperatures.getTemperatures().entrySet()) {
            temperature.put(temperaturess.getKey(), temperaturess.getValue());
        }
        return temperature;
    }

    public Double getAverageTemperature() {

        double temperature = 0;
        int total = 0;
        double valueOfAverage = 0;

        for(Map.Entry<String, Double> averageTemperature : temperatures.getTemperatures().entrySet()) {
            temperature = temperature + averageTemperature.getValue();
            total++;
            valueOfAverage = temperature/total;
        }
        return valueOfAverage;
    }

    public Double getMedianeTemperature() {

        List<Double> temperature = new ArrayList<>();

        double result = 0;

        for (Map.Entry<String, Double> temperatureNew : temperatures.getTemperatures().entrySet()) {
            temperature.add(temperatureNew.getValue());
        }

        Collections.sort(temperature);
        result = temperature.get(2);

        return result;
    }
}
