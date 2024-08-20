package org.thesatyendrakumar.structural_patterns.bridge;

public class InvestmentAccount implements Account {
    private String accountType;

    public InvestmentAccount(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public void assignToCustomer(String customerName) {
        System.out.println("Assigning " + accountType + " to " + customerName);
    }
}