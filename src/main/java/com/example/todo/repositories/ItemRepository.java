package com.example.todo.repositories;

// import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.todo.models.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item,Long>{
    public abstract List<Item> getItemById(Long id);    
    public abstract List<Item> getItemByTitle(String title);    
    public abstract List<Item> getItemByDescription(String description);    
}
