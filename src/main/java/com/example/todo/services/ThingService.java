package com.example.todo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.models.Thing;
import com.example.todo.repositories.ThingRespository;

@Service
public class ThingService {
    
    @Autowired
    ThingRespository thingRepository;

    public ArrayList<Thing> getThings(){
        return (ArrayList<Thing>) thingRepository.findAll();
    }

    public Thing createThing(Thing thing){
        return thingRepository.save(thing);
    }
}
