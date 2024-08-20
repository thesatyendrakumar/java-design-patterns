package org.thesatyendrakumar.structural_patterns.adaptor;

import java.time.LocalDateTime;

public class ModernTransactionAPIImpl implements ModernTransactionAPI {

    @Override
    public TransactionDTO fetchTransaction(int transactionId) {
        // Simulated data fetching from the modern system
        return new TransactionDTO(transactionId, 98765, "DEBIT", 1500.00, LocalDateTime.now());
    }
}