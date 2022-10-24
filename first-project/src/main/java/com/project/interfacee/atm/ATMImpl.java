package com.project.interfacee.atm;

import com.project.interfacee.atm.ATM;

public class ATMImpl implements ATM {
    @Override
    public void deposit() {
        System.out.println("Deposit");
    }

    @Override
    public void payout() {
        System.out.println("Payout");
    }

    @Override
    public void bankConnected() {
        ATM.super.bankConnected();
    }
}
