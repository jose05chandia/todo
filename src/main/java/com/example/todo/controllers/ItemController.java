package com.example.todo.controllers;

import java.util.ArrayList;
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

import com.example.todo.models.Item;
import com.example.todo.services.ItemService;

@RestController
@RequestMapping("api/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping
    public List<Item> getItems(){
        return itemService.getItems();
    }
    
    @GetMapping("/{id}")
    public Optional<Item> getItem(@PathVariable Long id){
        return itemService.findById(id);
    }
    @PostMapping
    public Item createItem(@RequestBody Item item){
        return itemService.createItem(item);
    }
    
    @PutMapping
    public Item uptdateItem(@RequestBody Item item){
        return itemService.updateItem(item);
    }

    @DeleteMapping("/{id}")
    public boolean deleteItem(@PathVariable Long id){
        return itemService.deleteItem(id);
    }

    @GetMapping("{title}")
    public List<Item> getByTitle(@PathVariable String title){
        return itemService.findByTitle(title);
    }
}
