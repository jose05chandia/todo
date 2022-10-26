package com.example.todo.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.todo.models.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long>{
    public abstract ArrayList<Account> getByEmail(String email);
    public abstract ArrayList<Account> getByPassword(String password);
}
