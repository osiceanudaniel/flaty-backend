package com.flaty.app.service;

import com.flaty.app.helper.DbHelper;
import com.flaty.app.model.management.User;
import com.flaty.app.model.management.UserType;
import com.flaty.app.repository.UserRepository;
import com.flaty.app.service.blueprints.UserServiceBlueprint;
import com.flaty.app.shared.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceBlueprint {

    @Autowired
    private UserRepository userRepository;

//********************************************INSERTION*********************************************
    @Override
    public void insertUser(UserModel userModel) {
        User userEntity = DbHelper.createUserEntity(userModel);
        userRepository.save(userEntity);
    }

//*********************************************GETTERS**********************************************
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getAllAdminUsers() {
        return userRepository.findByUserType(UserType.ADMINISTRATOR);
    }

    @Override
    public List<User> getAllLocatarUsers() {
        return userRepository.findByUserType(UserType.LOCATAR);
    }
}
