package com.prm391.readin.ReadIn.repository;

import com.prm391.readin.ReadIn.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    List<User> getHistory(String id);
    User findByName(String name);
}
