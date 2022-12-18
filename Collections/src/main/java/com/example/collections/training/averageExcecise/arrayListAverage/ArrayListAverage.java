package com.example.collections.training.averageExcecise.arrayListAverage;

import java.util.List;

public class ArrayListAverage {
    private final AverageClass averageClass = new AverageClass(this);
    private List<Integer> ratings;

    public ArrayListAverage(List<Integer> ratings) {
        this.ratings = ratings;
    }

    public void ratings() {
        ratings.add(1);
        ratings.add(1);
        ratings.add(2);
        ratings.add(2);
        ratings.add(3);
        ratings.add(3);
        ratings.add(4);
        ratings.add(5);
        ratings.add(5);
        ratings.add(6);

        ratings.remove(ratings.size() - 1);
        ratings.remove(ratings.get(0));
    }

    public void averageList() {
        averageClass.averageList();
    }

    public List<Integer> getRatings() {
        return ratings;
    }
}
