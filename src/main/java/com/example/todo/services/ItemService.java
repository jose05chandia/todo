package com.example.todo.services;

// import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.models.Item;
import com.example.todo.repositories.ItemRepository;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public Item createItem(Item item){
        return itemRepository.save(item);
    }

    public List<Item> getItems(){
        return  (List<Item>) itemRepository.findAll();
        
    }

    public Optional<Item> findById(Long id){
        return itemRepository.findById(id);
    }

    public List<Item> findByTitle(String title){
        return itemRepository.getItemByTitle(title);
    }

    public List<Item> findByDescription(String title){
        return itemRepository.getItemByDescription(title);
    }

    public Item updateItem(Item item){
        return itemRepository.save(item);
    }

    public boolean deleteItem(Long id){
        try{
            itemRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
