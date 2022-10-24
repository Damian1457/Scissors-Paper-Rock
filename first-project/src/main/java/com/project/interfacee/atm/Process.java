package com.project.interfacee.atm;

public class Process {
    private static ATM atm;
    public Process(ATM atm) {
        this.atm = atm;
    }

    public void process() {
        atm.payout();
        atm.deposit();
        atm.bankConnected();
    }

    public static void main(String[] args) {
        ATM processss = new ATMImpl();
        Process process = new Process(processss);
        process.process();
        System.out.println(ATM.terminationBank());
    }

}
