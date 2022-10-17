package com.example.todo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.models.Item;
import com.example.todo.repositories.ItemRepository;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;
    public ArrayList<Item> getItems(){
        return (ArrayList<Item>) itemRepository.findAll();
        
    }

    public Item createItem(Item item){
        return itemRepository.save(item);
    }

    public Optional<Item> findById(Long id){
        return itemRepository.findById(id);
    }

    public ArrayList<Item> findByTitle(String title){
        return itemRepository.getItemByTitle(title);
    }

    public ArrayList<Item> findByDescription(String title){
        return itemRepository.getItemByDescription(title);
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
