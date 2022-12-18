package com.example.stream.Stream;

public class Expression {
    public void calculateExpression(double a, double b, MathExpression mathExpression) {
        double result = mathExpression.calculate(a, b);
        System.out.println(result);
    }
}
