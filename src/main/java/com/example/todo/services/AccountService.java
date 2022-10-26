package com.example.todo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.models.Account;
import com.example.todo.repositories.AccountRepository;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;
    public Account creaAccount(Account account){
        return accountRepository.save(account);
    }
    public List<Account> getAccounts(){
        return accountRepository.findAll();
    }

    public Optional<Account> findById(Long id){
        return accountRepository.findById(id);
    }

    public ArrayList<Account> getByEmail(String email){
        return accountRepository.getByEmail(email);
    }

    public ArrayList<Account> getByPassword(String pass){
        return accountRepository.getByPassword(pass);
    }
    public Account updateAccount(Account account){
        return accountRepository.save(account);
    }
    


    public boolean deleteAccount(Long id){
        try{
            accountRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    
}
