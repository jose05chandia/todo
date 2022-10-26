package com.example.todo.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="states")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "state")
    private List<Thing> things;

    public State() {
    }
    public State(String name, List<Thing> things) {
        this.name = name;
        this.things = things;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Thing> getThings() {
        return things;
    }
    public void setThings(List<Thing> things) {
        this.things = things;
    }

    
    
}
