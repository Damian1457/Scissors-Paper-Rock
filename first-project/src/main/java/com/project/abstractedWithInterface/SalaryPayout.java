package com.project.abstractedWithInterface;

public abstract class SalaryPayout {
    private Employee employee;

    public SalaryPayout(Employee employee) {
        this.employee = employee;
    }
    protected abstract void payout();

    public void processPayout() {
        System.out.println("Creating payout for: " + this.employee.calculate() + " PLN");
        this.payout();
        System.out.println("Payout has been completed!");
    }
}
