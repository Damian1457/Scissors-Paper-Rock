package com.example.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(10.0, 20.0);
        } catch (Exception e) {
            System.out.println("It's not");
        } finally {
            System.out.println("Try again");
        }
    }
}
