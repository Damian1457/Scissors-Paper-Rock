package com.project.abstractedWithInterface;

public class Application {
    public static void main(String[] args) {
        BasicSalary basicSalary = new BasicSalary(true, 2000, 1.20);
        SalaryPayoutProcessor salaryPayoutProcessor = new SalaryPayoutProcessor(basicSalary);
        salaryPayoutProcessor.processPayout();
    }
}