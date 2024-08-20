package org.thesatyendrakumar.structural_patterns.proxy;

public class RealBankAccount implements BankAccount {
    private String accountNumber;

    public RealBankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void performTransaction(String transactionType, double amount) {
        System.out.println("Performing " + transactionType + " of $" + amount + " on account: " + accountNumber);
    }
}
