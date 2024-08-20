package org.thesatyendrakumar.structural_patterns.adaptor;

public interface ModernTransactionAPI {
    TransactionDTO fetchTransaction(int transactionId);
}