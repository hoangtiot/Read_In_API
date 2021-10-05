package com.prm391.readin.ReadIn.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String name;
    private List<String> reading_history;

    public User() {
    }

    public User(String id, String name, List<String> reading_history) {
        this.id = id;
        this.name = name;
        this.reading_history = reading_history;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getReading_history() {
        return reading_history;
    }

    public void setReading_history(List<String> reading_history) {
        this.reading_history = reading_history;
    }
}
