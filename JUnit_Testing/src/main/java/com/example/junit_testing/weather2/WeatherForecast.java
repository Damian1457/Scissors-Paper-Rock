package com.example.junit_testing.weather2;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> theTemperatures = new HashMap<>();

        for (Map.Entry<String, Double> theNewTemperatures : temperatures.getTemperatures().entrySet()) {
            theTemperatures.put(theNewTemperatures.getKey(), theNewTemperatures.getValue() + 1.0);
        }
        return theTemperatures;
    }

    public double calculateTheTemperturesAverage() {
        double sum = 0.0;
        double counter = 0.0;
        double average = 0.0;

        for (Map.Entry<String, Double> theMap : temperatures.getTemperatures().entrySet()) {
            counter++;
            sum = sum + theMap.getValue();
            average = sum / counter;
        }
        return average;
    }

    public double calculateMedianeOfTemperatures() {
        List<Double> theMediane = new ArrayList<>();
        double mediane = 0.0;


        for (Map.Entry<String, Double> theMedianee : temperatures.getTemperatures().entrySet()) {
            theMediane.add(theMedianee.getValue());
        }

        Collections.sort(theMediane);

        if (theMediane.size() % 2==0) {
            mediane = theMediane.get((theMediane.size() -1) / 2+1);
        } else {
            mediane = theMediane.get((theMediane.size()-1) / 2);
        }

        return mediane;
    }
}
