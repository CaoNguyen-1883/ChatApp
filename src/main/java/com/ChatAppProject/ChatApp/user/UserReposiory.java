package com.ChatAppProject.ChatApp.user;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserReposiory extends MongoRepository<User, String>
{

    public List<User> findAllByStatus(Status status);
}
