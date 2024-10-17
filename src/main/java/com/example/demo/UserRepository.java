package com.example.demo;

public interface UserRepository {
    User findById(int id);

    void save(User user);
}
