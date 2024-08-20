package org.thesatyendrakumar.structural_patterns.proxy;

public class Main {
    public static void main(String[] args) {
        BankAccount adminProxy = new BankAccountProxy("444555", "ADMIN");
        BankAccount userProxy = new BankAccountProxy("444555", "USER");
        BankAccount guestProxy = new BankAccountProxy("444555", "GUEST");

        adminProxy.performTransaction("Deposit", 500.00);
        userProxy.performTransaction("Withdrawal", 300.00);
        guestProxy.performTransaction("Deposit", 100.00);
    }
}
