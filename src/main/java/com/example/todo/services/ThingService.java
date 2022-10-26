package com.example.todo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.todo.models.Thing;
import com.example.todo.repositories.ThingRespository;

@Service
public class ThingService {
    
    @Autowired
    ThingRespository thingRepository;

    public Thing createThing(Thing thing){
        return thingRepository.save(thing);
    }
    public List<Thing> getThings(){
        return (ArrayList<Thing>) thingRepository.findAll();
    }
    
    public Optional<Thing> getThing(@PathVariable Long id){
        return thingRepository.findById(id);
    }

    public Thing updateThing(Thing thing){
        return thingRepository.save(thing);
    }

    public boolean deleteThing(@PathVariable Long id){
        try{
            thingRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }

}
