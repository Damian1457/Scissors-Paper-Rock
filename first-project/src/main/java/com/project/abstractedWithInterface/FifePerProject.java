package com.project.abstractedWithInterface;

public class FifePerProject implements Employee {
    private double productNumber;
    private double salaryProject;

    public FifePerProject(int productNumber, int salaryProject) {
        this.productNumber = productNumber;
        this.salaryProject = salaryProject;
    }

    @Override
    public double calculate() {
        return productNumber * salaryProject;
    }
}
