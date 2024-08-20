package org.thesatyendrakumar.structural_patterns.facade;

public class AccountFacade {
    private AccountService accountService;
    private AddressService addressService;
    private ServiceActivationService serviceActivationService;

    public AccountFacade() {
        this.accountService = new AccountService();
        this.addressService = new AddressService();
        this.serviceActivationService = new ServiceActivationService();
    }

    public void createCompleteAccount(String accountNumber, String address) {
        accountService.createAccount(accountNumber);
        addressService.addAddress(address);
        serviceActivationService.activateServices(accountNumber);
    }
}
