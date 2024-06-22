package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.User;
import com.spring.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {
@Autowired
private UserService userService;
@GetMapping("/findallusers")
public List<User> findAllUsers(){
	return userService.getAllUsers();
}
@PostMapping("/add")
public User addUser(@RequestBody @Valid User a){
    return userService.addUser(a);
}
}
