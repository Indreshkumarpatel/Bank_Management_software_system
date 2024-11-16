package com.example.Bankapp.service;

import com.example.Bankapp.entity.Account;
import com.example.Bankapp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements  AccountService {
    @Autowired
    AccountRepository accountRepository;
    @Override
    public Account createAccount(Account account) {
        Account account1=accountRepository.save(account);
        return account1;
    }

    @Override
    public Account getAccountDetailByAccountNumber(Long accountNumber) {
     Optional<Account> account= accountRepository.findById(accountNumber);
     if(account.isEmpty()){
         throw  new RuntimeException(" account not found");
     }

         Account foundAccout=account.get();

        return foundAccout;
    }

    @Override
    public List<Account> getAllAcountDetails() {
        List<Account> accountList=accountRepository.findAll();
        return accountList;
    }

    @Override
    public Account depostAmmount(Long accountNumber, Double amount) {
        return null;
    }

    @Override
    public Account withdrawAmmount(Long accountNumber, Double amount) {
        return null;
    }

    @Override
    public Account closeAccount(Long accountNumber) {
        return null;
    }
}
