package com.project.interfacee.atm;

public interface ATM {
    void deposit();

    void payout();

    default void bankConnected() {
        System.out.println("You are connected to the bank");
    }

    static String terminationBank() {
        return "The bank was finish, and disconect";
    }

}
