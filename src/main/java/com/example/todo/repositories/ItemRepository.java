package com.example.todo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.todo.models.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item,Long>{
    public abstract ArrayList<Item> getItemById(Long id);    
    public abstract ArrayList<Item> getItemByTitle(String title);    
    public abstract ArrayList<Item> getItemByDescription(String description);    
}
