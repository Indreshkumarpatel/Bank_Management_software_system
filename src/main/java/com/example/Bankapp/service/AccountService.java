package com.example.Bankapp.service;

import com.example.Bankapp.entity.Account;

import java.util.List;

public interface AccountService {

    public Account createAccount(Account account);
    public Account getAccountDetailByAccountNumber(Long accountNumber);
    public List<Account> getAllAcountDetails();
    public Account depostAmmount(Long accountNumber, Double amount);
    public Account withdrawAmmount(Long accountNumber, Double amount);
    public Account closeAccount(Long accountNumber);

}
