package com.example.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private List<Country> countryList = new ArrayList<>();
    private String continent;

    public Continent(String continent) {
        this.continent = continent;
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }

    public List<Country> getCountryList() {
        return countryList;
    }
}
