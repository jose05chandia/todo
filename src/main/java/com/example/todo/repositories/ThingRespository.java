package com.example.todo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.todo.models.Thing;

@Repository
public interface ThingRespository extends CrudRepository<Thing,Long>{
    public abstract ArrayList<Thing> findByDescription(String description);
}
