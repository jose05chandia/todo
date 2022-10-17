package com.example.todo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.models.Item;
import com.example.todo.services.ItemService;

@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping
    public ArrayList<Item> getItems(){
        return itemService.getItems();
    }
    @PostMapping
    public Item creaItem(@RequestBody Item item){
        return itemService.createItem(item);
    }
}
