package com.example.todo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.models.State;
import com.example.todo.services.StateService;

@RestController
@RequestMapping("/state")
public class StateController {
    
    @Autowired
    StateService stateService;

    @GetMapping
    public ArrayList<State>getStates(){
        return stateService.getStates();
    }

    @PostMapping
    public State createState(@RequestBody State state){
        return stateService.createState(state);
    }
}
