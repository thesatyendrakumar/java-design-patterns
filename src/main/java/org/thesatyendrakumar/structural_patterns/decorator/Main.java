package org.thesatyendrakumar.structural_patterns.decorator;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BasicBankAccount("987654");
        account = new OverdraftProtectionDecorator(account, 500.00);
        account = new PremiumServicesDecorator(account, "24/7 Customer Support");

        System.out.println(account.getDetails());
    }
}
