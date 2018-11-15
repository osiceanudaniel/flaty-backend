package com.flaty.app.service.blueprints;

import com.flaty.app.model.management.User;
import com.flaty.app.shared.UserModel;

import java.util.List;

public interface UserServiceBlueprint {

    List<User> getAllUsers();

    void insertUser(UserModel userModel);

    List<User> getAllAdminUsers();

    List<User> getAllLocatarUsers();
}
