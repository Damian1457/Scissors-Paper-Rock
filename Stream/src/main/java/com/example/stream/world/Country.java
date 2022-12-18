package com.example.stream.world;

import java.math.BigDecimal;

public class Country {
    private String country;
    private BigDecimal peopleQuantity;

    public Country(String country, BigDecimal peopleQuantity) {
        this.country = country;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
