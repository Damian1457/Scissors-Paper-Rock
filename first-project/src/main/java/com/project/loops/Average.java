package com.project.loops;

public class Average {
    private int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

    public void calculateAverage() {
        int sum = 0;
        double averageLenght = numbers.length;


        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println("Array all numbers: [" + i + "] " + numbers[i]);
        }
        double sumOfAverage = sum / averageLenght;
        System.out.println(sumOfAverage);
    }

}
