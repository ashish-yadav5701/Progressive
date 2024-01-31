package com.wecp.progressive.entity;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.*;
 
 @Entity
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionId;
    private int accountId;
    private double amount;
    private String transactionType;
    private Date transactionDate;
 
   
    public Transactions() {
    }
   
    public Transactions(int transactionId, int accountId, double amount, Date transaction_date,
            String transaction_type) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.amount = amount;
        this.transactionDate = transaction_date;
        this.transactionType = transaction_type;
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
 
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public Date getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(Date transaction_date) {
        this.transactionDate = transaction_date;
    }
    public String getTransactionType() {
        return transactionType;
    }
    public void setTransactionType(String transaction_type) {
        this.transactionType = transaction_type;
    }
 
 
}