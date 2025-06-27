package com.example.RestAPI.api.controller;
import com.example.RestAPI.api.model.User;
import com.example.RestAPI.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.Optional;
import java.util.List;


// This annotation tells Spring that this class will handle REST API requests
@RestController
public class UserController {
    // This field holds a reference to the UserService, which provides user-related operations
    private UserService userService;

    // Constructor for UserController. Spring will automatically provide a UserService instance when creating this controller.
    public UserController(UserService userService){
        // Assign the provided UserService to the field so it can be used in the methods below
        this.userService = userService;
    }

    // This method handles GET requests to /users and returns a list of all users
    @GetMapping("/users")
    public List<User> getUsers() {
        // Calls the UserService to get all users and returns the list
        return userService.getUsers();
    }

    // This method handles GET requests to /user?id=... and returns a single user by their ID
    @GetMapping("/user")
    public User getUser(@RequestParam Integer id) {
        // Calls the UserService to get a user by ID. The result is wrapped in an Optional to handle the case where the user might not exist.
        Optional<User> user = userService.getUser(id);

        // If a user with the given ID exists, return it
        if(user.isPresent()) {
            return user.get();
        }

        // If no user is found, return null (could also return an error or a special response in a real app)
        return null;
    }

    // This method handles POST requests to /users and adds a new user
    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void removeUser(@PathVariable Integer id) {
        userService.removeUser(id);
    }
}
