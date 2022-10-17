package com.example.todo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.todo.models.State;

@Repository
public interface StateRepository extends CrudRepository<State,Long> {
    public abstract ArrayList<State> findByName(String name);
}
