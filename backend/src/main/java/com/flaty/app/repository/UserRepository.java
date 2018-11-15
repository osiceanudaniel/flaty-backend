package com.flaty.app.repository;

import com.flaty.app.model.management.User;
import com.flaty.app.model.management.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByUserType(UserType userType);
}
