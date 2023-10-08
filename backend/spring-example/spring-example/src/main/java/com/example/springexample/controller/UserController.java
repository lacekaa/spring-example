package com.example.springexample.controller;

import com.example.springexample.domain.user.User;
import com.example.springexample.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user-controller")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all-user")
    public ResponseEntity<List<User>> allUser() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/find-by-id/{id}")
    public ResponseEntity<User> findByID(@PathVariable("id") UUID id) throws Exception {
        userService.findById(id);
        User user = userService.findById(id).orElseThrow(() -> new Exception("No such Element found"));
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") UUID id) {
        userService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/add-new-user")
    public void addUser(User user) {
        this.userService.addUser(user);
    }
}
