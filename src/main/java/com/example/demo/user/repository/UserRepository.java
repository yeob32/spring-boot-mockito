package com.example.demo.user.repository;

import com.example.demo.user.User;

import java.util.List;

public interface UserRepository {
    User findUser(long id);
    List<User> findAll();
    long count();
}
