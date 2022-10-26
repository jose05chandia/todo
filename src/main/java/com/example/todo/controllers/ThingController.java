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

import com.example.todo.models.Thing;
import com.example.todo.services.ThingService;

@RestController
@RequestMapping("api/thing")
public class ThingController {
    
    @Autowired
    ThingService thingService;

    @PostMapping
    public Thing createThing(@RequestBody Thing thing){
        return thingService.createThing(thing);
    }

    @GetMapping
    public List<Thing> getThings(){
        return thingService.getThings();
    }
    @GetMapping("/{id}")
    public Optional<Thing> getThing(@PathVariable Long id){
        return thingService.getThing(id);
    }

    @PutMapping
    public Thing updateThing(@RequestBody Thing thing){
        return thingService.updateThing(thing);
    }

    @DeleteMapping("/{id}")
    public boolean deleteThing(@PathVariable Long id){
        try{
            thingService.deleteThing(id);
            return true;
        } catch(Exception e){
            return false;

        }
    }

}
