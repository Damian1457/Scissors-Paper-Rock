package com.project.abstracted;

public class CashMashines extends Bank {
    @Override
    protected void insertCard() {
        System.out.println("Please insert your credit card...");
    }

    @Override
    protected void enterPin() {
        System.out.println("Eneter your PIN code...");
    }

    @Override
    protected void enterPayout() {
        System.out.println("Enter the amount to be withdrawn...");
    }

    @Override
    protected void withdrawCash() {
        System.out.println("We pay out cash for you...");
    }

    @Override
    protected void thankYouFor() {
        System.out.println("Thank you for using the ATM.");
    }

    public static void main(String[] args) {
        CashMashines cashMashines = new CashMashines();
        cashMashines.process();
    }
}
