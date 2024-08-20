package org.thesatyendrakumar.structural_patterns.decorator;

public class OverdraftProtectionDecorator extends AccountDecorator {
    private double limit;

    public OverdraftProtectionDecorator(BankAccount account, double limit) {
        super(account);
        this.limit = limit;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Overdraft Protection Limit: " + limit;
    }
}
