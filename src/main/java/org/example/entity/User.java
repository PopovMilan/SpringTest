package org.example.entity;

import javax.persistence.Entity;

@Entity
public class User {

    private int id = 0;
    private String name = null;
    private String value = null;
    public User(int id, String name, String value)
    {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
