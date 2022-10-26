package com.example.todo.controllers;

// import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.models.Account;
import com.example.todo.services.AccountService;

@RestController
@RequestMapping("api/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @PostMapping
    public Account createAccount(@RequestBody Account account){
        return accountService.creaAccount(account);
    }

    @GetMapping()
    public List<Account> getAccounts(){
        return accountService.getAccounts();
    }

    @GetMapping("/{id}")
    public Optional<Account> getAccount(@PathVariable Long id){
        return accountService.findById(id);
    }

    
    @PutMapping
    public Account updateAccount(@RequestBody Account account){
        return accountService.updateAccount(account);
    }
    
    @DeleteMapping("/{id}")
    public boolean deleteAccount(@PathVariable Long id){
        return accountService.deleteAccount(id);
    }


    @GetMapping("{email}")
    public List<Account> getByEmail(@PathVariable String email){
        return accountService.getByEmail(email);
    }
    

}
