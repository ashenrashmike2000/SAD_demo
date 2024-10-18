package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component("inMemoryUserRepository")
public class InMemoryUserRepository implements UserRepository {

    private Map<Integer, User> userMap = new HashMap<>();

    public InMemoryUserRepository() {
        User nimal = new User();
        nimal.name = "Nimal";
        nimal.age = 26;
        nimal.tp = "0123456789";
        userMap.put(1, nimal);

        User kamal = new User();
        kamal.name = "Kamal";
        kamal.age = 30;
        kamal.tp = "1234567890";
        userMap.put(2, kamal);

    }

    @Override
    public User findById(int id) {
        return userMap.get(id);
    }

    @Override
    public void save(User user) {
        userMap.put(user.id, user);
    }
}
