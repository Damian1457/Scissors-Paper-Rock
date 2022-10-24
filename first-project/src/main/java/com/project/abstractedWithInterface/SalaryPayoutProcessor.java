package com.project.abstractedWithInterface;

public class SalaryPayoutProcessor extends SalaryPayout {
    public SalaryPayoutProcessor(Employee employee) {
        super(employee);
    }
    @Override
    protected void payout() {
        System.out.println("Sending money to employee");
    }
}
