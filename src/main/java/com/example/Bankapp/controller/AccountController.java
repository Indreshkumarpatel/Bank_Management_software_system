package com.example.Bankapp.controller;

import com.example.Bankapp.entity.Account;
import com.example.Bankapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountController {
    @Autowired
    AccountService service;

    @PostMapping("/create")
    public ResponseEntity<Account> createAccount(@RequestBody Account account){
         Account createaccount=service.createAccount(account);
        return  ResponseEntity.status(HttpStatus.CREATED).body(createaccount);
    }

    @GetMapping("/{accountNumber}")
     public  Account getAcccountbyAccountNumber( @PathVariable Long accountNumber){
        Account acount=service.getAccountDetailByAccountNumber(accountNumber);
        return  acount;
    }


    @GetMapping("/getallaccount")
    public List<Account>getAllAccountDetail(){
        List<Account> accounts=service.getAllAcountDetails();
        return  accounts;
    }

}
