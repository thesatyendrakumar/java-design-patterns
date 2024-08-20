package org.thesatyendrakumar.structural_patterns.decorator;

public abstract class AccountDecorator implements BankAccount {
    protected BankAccount account;

    public AccountDecorator(BankAccount account) {
        this.account = account;
    }

    @Override
    public String getDetails() {
        return account.getDetails();
    }
}
