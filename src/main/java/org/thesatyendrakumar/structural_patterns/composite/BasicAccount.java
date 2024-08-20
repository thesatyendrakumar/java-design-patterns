package org.thesatyendrakumar.structural_patterns.composite;

public class BasicAccount implements AccountComponent {
    private String accountNumber;
    private String accountType;

    public BasicAccount(String accountNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    @Override
    public void showDetails() {
        System.out.println("Account Number: " + accountNumber + ", Type: " + accountType);
    }
}