package com.hackathon.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    public UserRepository repository;

    public List<User> getUsers(){
        return repository.findAll();
    }

    public User getUser(Long id){
        return repository.getById(id);
    }

    public User addUser(User user) {
        repository.save(user);
        return user;
    }
}
