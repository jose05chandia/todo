package com.example.todo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.models.Thing;
import com.example.todo.services.ThingService;

@RestController
@RequestMapping("thing")
public class ThingController {
    
    @Autowired
    ThingService thingService;

    @GetMapping
    public ArrayList<Thing> getThings(){
        return thingService.getThings();
    }

    @PostMapping
    public Thing createThing(@RequestBody Thing thing){
        return thingService.createThing(thing);
    }
}
