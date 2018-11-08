package com.flaty.app.controller;

import com.flaty.app.model.User;
import com.flaty.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private UserService userService;

    /**     POST    **/
//**************************************************************************************************
/*    @PostMapping(path = "/admin/insert_user")
    @ResponseBody
    public RequestEntity<Void> insertUser(@RequestBody)*/

    /**     GET    **/
//**************************************************************************************************
    @GetMapping(path = "/locatari/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
