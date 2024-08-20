package org.thesatyendrakumar.adaptor;

public class Main {

    public static void main(String[] args) {
        ModernTransactionAPI api = new ModernTransactionAPIImpl();
        LegacyBankSystem legacySystem = new TransactionAdapter(api);
        Transaction transaction = legacySystem.getTransaction(12345);
        System.out.println("Transaction Amount: " + transaction.getAmount());
    }
}
