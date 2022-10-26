package com.example.todo.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;
    private String title;
    private String description;

    @ManyToOne
    private Account account;

    @OneToMany(mappedBy = "item")
    private List<Thing> things;

    
    public Item() {
    }
    

    public Item(String title, String description, Account account, List<Thing> things) {
        this.title = title;
        this.description = description;
        this.account = account;
        this.things = things;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public List<Thing> getThings() {
        return things;
    }
    public void setThings(List<Thing> things) {
        this.things = things;
    }
    
    

    
}
