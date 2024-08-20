package org.thesatyendrakumar.structural_patterns.bridge;

public class SavingsAccount implements Account {
    private String accountType;

    public SavingsAccount(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public void assignToCustomer(String customerName) {
        System.out.println("Assigning " + accountType + " to " + customerName);
    }
}
