package com.example.collections.training.hashMap.students;

import java.util.Arrays;

public class Ratings {
    private Double[] rating;

    public Ratings(Double[] rating) {
        this.rating = rating;
    }

    public Double[] getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Ratings{" +
                "rating=" + Arrays.toString(rating) +
                '}';
    }
}
