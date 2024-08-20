package org.thesatyendrakumar.structural_patterns.adaptor;

public interface LegacyBankSystem {
    Transaction getTransaction(int transactionId);
}