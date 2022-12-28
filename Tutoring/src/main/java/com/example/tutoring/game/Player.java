package com.example.tutoring.game;

public class Player {
    private int number = 0;

    public int whichNumber() {
        number = (int) (Math.random() * 10);
        System.out.println("I choose the number: " + number);
        return number;
    }

    public int getNumber() {
        return number;
    }
}
