package org.thesatyendrakumar.structural_patterns.flyweight;

public class BankAccount {
    private String accountNumber;
    private Branch branch;

    public BankAccount(String accountNumber, Branch branch) {
        this.accountNumber = accountNumber;
        this.branch = branch;
    }

    public void showDetails() {
        System.out.println("Account Number: " + accountNumber + ", Branch: " + branch.getBranchName() + ", Address: " + branch.getBranchAddress());
    }
}
