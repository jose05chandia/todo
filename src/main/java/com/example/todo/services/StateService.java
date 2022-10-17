package com.example.todo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.models.State;
import com.example.todo.repositories.StateRepository;

@Service
public class StateService {
    @Autowired
    StateRepository stateRepository;
    
    public ArrayList<State> getStates(){
        return (ArrayList<State>) stateRepository.findAll();
    }

    public Optional<State> getStateById(Long id){
        return stateRepository.findById(id);
    }

    public ArrayList<State> getByName(String name){
        return stateRepository.findByName(name);
    }

    public State createState(State state){
        return stateRepository.save(state);
    }
    public boolean deleteState(Long id){
        try{
            stateRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
