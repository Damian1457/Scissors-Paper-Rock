package com.example.stream.Stream;

public class Application {
    public static void main(String[] args) {
        Expression expression = new Expression();
        expression.calculateExpression(10, 5, FunctionalCalculator::addAToB);
        expression.calculateExpression(10, 5, FunctionalCalculator::addAToB);
        expression.calculateExpression(10, 5, FunctionalCalculator::addAToB);
        expression.calculateExpression(10, 5, FunctionalCalculator::addAToB);



    }
}
