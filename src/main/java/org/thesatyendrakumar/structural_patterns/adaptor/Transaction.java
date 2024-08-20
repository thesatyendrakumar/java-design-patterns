package org.thesatyendrakumar.structural_patterns.adaptor;

import java.time.LocalDateTime;

public class Transaction {
    private int transactionId;
    private int accountId;
    private String transactionType;
    private double transactionAmount;
    private LocalDateTime dateTime;

    public Transaction(int transactionId, int accountId, String transactionType, double transactionAmount, LocalDateTime dateTime) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
        this.dateTime = dateTime;
    }

    public double getAmount() {
        return transactionAmount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}