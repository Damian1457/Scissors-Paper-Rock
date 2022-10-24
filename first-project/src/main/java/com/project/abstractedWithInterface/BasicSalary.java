package com.project.abstractedWithInterface;

public class BasicSalary implements Employee {
    private boolean sale;
    private double basicSalary;
    private double procentSalary;

    public BasicSalary(boolean sale, double basicSalary, double procentSalary) {
        this.sale = sale;
        this.basicSalary = basicSalary;
        this.procentSalary = procentSalary;
    }

    @Override
    public double calculate() {
        if (sale) {
            return basicSalary * procentSalary;
        } else
            return basicSalary;
    }
}
