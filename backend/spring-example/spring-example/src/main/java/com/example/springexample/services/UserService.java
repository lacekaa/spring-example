package com.example.springexample.services;

import com.example.springexample.domain.user.User;
import com.example.springexample.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public void addUser(User user){
    userRepository.save(user);
    }

    public void deleteById(UUID id){
    userRepository.deleteById(id);
    }

    public Optional<User> findById(UUID id){
    return userRepository.findById(id);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
