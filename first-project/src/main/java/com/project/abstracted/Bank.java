package com.project.abstracted;

public abstract class Bank {
    abstract protected void insertCard();

    abstract protected void enterPin();

    abstract protected void enterPayout();

    private void weAccepted() {
        System.out.println("We have accepted your request for withdraw.");
    }

    private void checkTheAccount() {
        System.out.println("Wait, we chceck your account...");
    }

    private void confirmationOfThePossibility() {
        System.out.println("You can withdraw the money");
    }

    abstract protected void withdrawCash();

    abstract protected void thankYouFor();

    public void process() {
        this.insertCard();
        this.enterPin();
        this.enterPayout();
        this.weAccepted();
        this.checkTheAccount();
        this.confirmationOfThePossibility();
        this.withdrawCash();
        this.thankYouFor();
    }
}
