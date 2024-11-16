package com.example.Bankapp.entity;

import jakarta.persistence.*;

@Entity
@Table()   //@Table(name=" provide custom table name")

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountNumber;
    @Column
    private String accountHolderName;
    @Column
    private Double accountBalance;

    // Default constructor
    public Account() {
    }

    // Parameterized constructor
    public Account(Long accountNumber, String accountHolderName, Double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    // Getter and Setter methods for accountNumber
    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and Setter methods for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter and Setter methods for accountBalance
    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
