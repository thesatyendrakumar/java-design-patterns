package org.thesatyendrakumar.structural_patterns.facade;

public class Main {
    public static void main(String[] args) {
        AccountFacade facade = new AccountFacade();
        facade.createCompleteAccount("111222", "456 Elm St");
    }
}
