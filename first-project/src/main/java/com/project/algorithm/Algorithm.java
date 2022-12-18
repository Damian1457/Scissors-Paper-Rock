package com.project.algorithm;

public class Algorithm {
    private int number1;
    private int number2;

    public void loop(int number1, int number2) {
        while (number1 != number2) {
            if (number1 > number2) {
                number1 = number1 - number2;
            } else {
                number2 = number2 - number1;
            }
            System.out.println(number1);
        }
    }

    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();
        algorithm.loop(50, 30);
    }
}
