package org.thesatyendrakumar.structural_patterns.flyweight;

public class Main {
    public static void main(String[] args) {
        Branch branch = BranchFactory.getBranch("Main Branch", "789 Pine St");

        BankAccount account1 = new BankAccount("222333", branch);
        BankAccount account2 = new BankAccount("333444", branch);

        account1.showDetails();
        account2.showDetails();
    }
}