package org.thesatyendrakumar.structural_patterns.decorator;

public class BasicBankAccount implements BankAccount {
    private String accountNumber;

    public BasicBankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String getDetails() {
        return "Account Number: " + accountNumber;
    }
}