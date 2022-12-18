package com.project.iterator.race.sum;

import java.util.Random;

public class Sum {
    private int sumA = 1000;
    private int sumB = 0;
    private int tryCounter = 0;

    public void loops() {
        Random randomGenerator = new Random();

        while (sumA > sumB) {
            tryCounter++;
            System.out.println(tryCounter);

            sumA += randomGenerator.nextInt(10);
            sumB += randomGenerator.nextInt(50);

            System.out.println("The value of the number sumA is " + sumA + " and " + " the value of the number sumB is: " + sumB);
        }
        System.out.println("The loops was finished!");
    }

}
