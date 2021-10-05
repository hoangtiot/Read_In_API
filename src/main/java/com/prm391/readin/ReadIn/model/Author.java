package com.prm391.readin.ReadIn.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "authors")
public class Author {

    @Id
    private String id;
    private String name;
    private String description;
    private List<String> novels_id;
    private String nation;

    public Author() {
    }

    public Author(String id, String name, String description, List<String> novels_id, String nation) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.novels_id = novels_id;
        this.nation = nation;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getNovels_id() {
        return novels_id;
    }

    public void setNovels_id(List<String> novels_id) {
        this.novels_id = novels_id;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
}