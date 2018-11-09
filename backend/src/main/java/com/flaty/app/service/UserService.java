package com.flaty.app.service;

import com.flaty.app.model.management.User;
import com.flaty.app.model.management.UserType;
import com.flaty.app.repository.UserRepository;
import com.flaty.app.service.blueprints.UserServiceBlueprint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService implements UserServiceBlueprint {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
//        userRepository.save(createUser());
        return userRepository.findAll();
    }

    private User createUser() {
        User user = new User();

        user.setUserType(UserType.ADMINISTRATOR);
        user.setCreationDate(new Date());
        user.setEmail("email@test.com");
        user.setName("User1");
        user.setPassword("password1");

        return user;
    }
}
