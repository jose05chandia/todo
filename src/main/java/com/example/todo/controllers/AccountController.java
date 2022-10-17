package com.example.todo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.models.Account;
import com.example.todo.services.AccountService;

@RestController
@RequestMapping("account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping()
    public ArrayList<Account> getAccounts(){
        return accountService.getAccounts();
    }

    @PostMapping
    public Account createAccount(@RequestBody Account account){
        return accountService.creaAccount(account);
    }
}
