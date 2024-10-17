package com.example.demo;

import org.springframework.web.bind.annotation.*;

// controller is used to define endpoints
// an endpoint is a method in controller
@RestController
public class UserController {
    //todo: use dependency injection
    UserRepository userRepository = new InMemoryUserRepository();

    // retrieving an existing user endpoint (get user) -> GET
    @GetMapping("/user")
    public User getuser(@RequestParam int id){
        return userRepository.findById(id);
    }

    // user registration endpoint (add new user) -> POST user
    @PostMapping("/user")
    public void addUser(@RequestBody User user){
        userRepository.save(user);
    }
    // removing a user
    // updating a user
    // or any other user related actions.

    // next week:
    // try to use dependency injection
    // try to connect a database(postgresql server installed)
    // some homework for you ^^

    //prerequisites for the next week
    // 1. postgresql database
    // 2. pgadmin tooL
}