package org.thesatyendrakumar.structural_patterns.composite;

public class Main {
    public static void main(String[] args) {
        AccountComponent account = new BasicAccount("123456", "Savings");
        AccountComponent accountWithDetails = new AccountWithDetails(account, "Main Branch", "Alice Johnson");

        accountWithDetails.showDetails();
    }
}
