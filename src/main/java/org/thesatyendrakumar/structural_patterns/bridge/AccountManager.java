package org.thesatyendrakumar.structural_patterns.bridge;

public abstract class AccountManager {
    protected Account account;

    public AccountManager(Account account) {
        this.account = account;
    }

    abstract void manageAccount(String customerName);
}