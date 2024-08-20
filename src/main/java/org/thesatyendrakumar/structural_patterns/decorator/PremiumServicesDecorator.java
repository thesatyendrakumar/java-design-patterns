package org.thesatyendrakumar.structural_patterns.decorator;

public class PremiumServicesDecorator extends AccountDecorator {
    private String serviceDetails;

    public PremiumServicesDecorator(BankAccount account, String serviceDetails) {
        super(account);
        this.serviceDetails = serviceDetails;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Premium Services: " + serviceDetails;
    }
}
