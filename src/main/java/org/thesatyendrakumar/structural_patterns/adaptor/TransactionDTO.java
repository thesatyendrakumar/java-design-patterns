package org.thesatyendrakumar.structural_patterns.adaptor;

import java.time.LocalDateTime;

public class TransactionDTO {
    private int transactionId;
    private int accountId;
    private String transactionType;
    private double transactionAmount;
    private LocalDateTime dateTime;

    public TransactionDTO(int transactionId, int accountId, String transactionType, double transactionAmount, LocalDateTime dateTime) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
        this.dateTime = dateTime;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}