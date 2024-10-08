package org.thesatyendrakumar.structural_patterns.bridge;

public class CustomerAccountManager extends AccountManager {

    public CustomerAccountManager(Account account) {
        super(account);
    }

    @Override
    void manageAccount(String customerName) {
        account.assignToCustomer(customerName);
    }
}
