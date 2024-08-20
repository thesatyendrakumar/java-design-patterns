package org.thesatyendrakumar.structural_patterns.bridge;

public class CheckingAccount implements Account {
    private String accountType;

    public CheckingAccount(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public void assignToCustomer(String customerName) {
        System.out.println("Assigning " + accountType + " to " + customerName);
    }
}