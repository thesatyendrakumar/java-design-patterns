package org.thesatyendrakumar.structural_patterns.composite;

public class AccountWithDetails implements AccountComponent {
    private AccountComponent account;
    private String branch;
    private String manager;

    public AccountWithDetails(AccountComponent account, String branch, String manager) {
        this.account = account;
        this.branch = branch;
        this.manager = manager;
    }

    @Override
    public void showDetails() {
        account.showDetails();
        System.out.println("Branch: " + branch + ", Manager: " + manager);
    }
}
