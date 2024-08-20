package org.thesatyendrakumar.bridge;

public class Main {

    public static void main(String[] args) {
        Account savings = new SavingsAccount("Savings Account");
        Account checking = new CheckingAccount("Checking Account");

        AccountManager savingsManager = new CustomerAccountManager(savings);
        AccountManager checkingManager = new CustomerAccountManager(checking);

        savingsManager.manageAccount("Jane Doe");
        checkingManager.manageAccount("John Smith");
    }
}