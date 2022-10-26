package com.example.todo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="thing")
public class Thing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;
    private String description;

    @ManyToOne
    private Item item;

    @ManyToOne
    private State state;

    
    public Thing() {
    }
    public Thing(String description, Item item, State state) {
        this.description = description;
        this.item = item;
        this.state = state;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
    
    
    
}
