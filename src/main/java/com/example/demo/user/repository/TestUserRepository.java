package com.example.demo.user.repository;

import com.example.demo.user.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestUserRepository implements UserRepository {

    @Override
    public User findUser(long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
