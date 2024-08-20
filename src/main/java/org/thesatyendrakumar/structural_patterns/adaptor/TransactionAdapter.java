package org.thesatyendrakumar.structural_patterns.adaptor;

public class TransactionAdapter implements LegacyBankSystem {
    private ModernTransactionAPI modernTransactionAPI;

    public TransactionAdapter(ModernTransactionAPI modernTransactionAPI) {
        this.modernTransactionAPI = modernTransactionAPI;
    }

    @Override
    public Transaction getTransaction(int transactionId) {
        TransactionDTO dto = modernTransactionAPI.fetchTransaction(transactionId);
        return new Transaction(dto.getTransactionId(), dto.getAccountId(), dto.getTransactionType(), dto.getTransactionAmount(), dto.getDateTime());
    }
}
