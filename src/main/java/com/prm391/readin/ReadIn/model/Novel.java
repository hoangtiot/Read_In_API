package com.prm391.readin.ReadIn.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Document(collection = "novels")
public class Novel {

    @Id
    private String id;

    private String name;
    private String author;
    private List<String> category;
    private Map<Integer, List<String>> chapter;
    private String  description;
    private String image;
    private String status;
    private String nation;
    private int no_views;

    public Novel() {
    }



    public Novel(String name, String author, List<String> category, String description, String image, String status, String nation, int no_views) {

        this.name = name;
        this.author = author;
        this.category = category;
        this.description = description;
        this.image = image;
        this.status = status;
        this.nation = nation;
        this.no_views = no_views;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public Map<Integer, List<String>> getChapter() {
        return chapter;
    }

    public void setChapter(Map<Integer, List<String>> chapter) {
        this.chapter = chapter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getNo_views() {
        return no_views;
    }

    public void setNo_views(int no_views) {
        this.no_views = no_views;
    }
}