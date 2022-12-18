package com.example.junit_testing.calculator;

public class SimpleCalculator {
    private int a;
    private int b;

    public SimpleCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public int sub(int a, int b) {
        int result = a - b;
        return result;
    }
}
