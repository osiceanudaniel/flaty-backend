package com.flaty.app.controller;

import com.flaty.app.model.management.User;
import com.flaty.app.service.UserService;
import com.flaty.app.shared.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private UserService userService;

//******************************************POST****************************************************
    @PostMapping(path = "/users/insert_user")
    public void insertUser(@RequestBody UserModel user) {
        userService.insertUser(user);
    }

//*******************************************GET****************************************************
    @GetMapping(path = "/users/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(path = "/admins/all")
    public List<User> getAllAdminUsers() {
        return userService.getAllAdminUsers();
    }

    @GetMapping(path = "/locatari/all")
    public List<User> getAllLocatarUsers() {
        return userService.getAllLocatarUsers();
    }
}
