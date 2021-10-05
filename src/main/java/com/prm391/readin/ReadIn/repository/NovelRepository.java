package com.prm391.readin.ReadIn.repository;

import com.prm391.readin.ReadIn.model.Novel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NovelRepository extends MongoRepository<Novel, String> {
    List<Novel> findByName(String name);
    List<Novel> findByAuthor(String author);
    List<Novel> findByCategory(String category);
    List<Novel> findByStatus(Boolean status);
}
