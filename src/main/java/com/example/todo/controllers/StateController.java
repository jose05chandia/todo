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

import com.example.todo.models.State;
import com.example.todo.services.StateService;

@RestController
@RequestMapping("api/state")
public class StateController {
    
    @Autowired
    StateService stateService;

    @PostMapping
    public State createState(@RequestBody State state){
        return stateService.createState(state);
    }

    @GetMapping
    public List<State>getStates(){
        return stateService.getStates();
    }

    @GetMapping("/{id}")
    public Optional<State> getState(@PathVariable Long id){
        return stateService.getStateById(id);
    }

    @PutMapping
    public State updateState(@RequestBody State state){
        return stateService.updateState(state);
    }

    @DeleteMapping("/{id}")
    public boolean deleteState(@PathVariable Long id){
        return stateService.deleteState(id);
    }

    @GetMapping("{name}")
    public List<State> getByTitle(@PathVariable String name){
        return stateService.getByName(name);
    }

}
