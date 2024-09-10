package com.mywebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mywebsite.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
