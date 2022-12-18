package com.example.collections.training.averageExcecise.arrayListAverage;

public class AverageClass {
    private final ArrayListAverage arrayListAverage;

    public AverageClass(ArrayListAverage arrayListAverage) {
        this.arrayListAverage = arrayListAverage;
    }

    public void averageList() {
        arrayListAverage.ratings();

        double average = 0;
        double size = arrayListAverage.getRatings().size();
        for (int i = 0; i < arrayListAverage.getRatings().size(); i++)
            average += arrayListAverage.getRatings().get(i);

        double sum = average / size;
        System.out.println("The average of adding all grades is: " + sum);
    }
}