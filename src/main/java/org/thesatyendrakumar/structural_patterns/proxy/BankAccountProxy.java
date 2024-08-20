package org.thesatyendrakumar.structural_patterns.proxy;

public class BankAccountProxy implements BankAccount {
    private RealBankAccount realBankAccount;
    private String userRole;

    public BankAccountProxy(String accountNumber, String userRole) {
        this.realBankAccount = new RealBankAccount(accountNumber);
        this.userRole = userRole;
    }

    @Override
    public void performTransaction(String transactionType, double amount) {
        if ("ADMIN".equals(userRole) || "USER".equals(userRole)) {
            realBankAccount.performTransaction(transactionType, amount);
        } else {
            System.out.println("Access Denied: Unauthorized user role");
        }
    }
}
