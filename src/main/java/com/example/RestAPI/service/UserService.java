package com.example.RestAPI.service;
import com.example.RestAPI.api.model.User;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    // This field holds a list of User objects. It acts as our in-memory database for this example.
    private List<User> userList;

    // Constructor for UserService. This is called when the service is created.
    public UserService() {
        // Initialize the userList as an empty ArrayList.
        userList = new ArrayList<>();

        // Create some sample User objects with id, name, age, and email.
        User user1 = new User(0, "Admin", 29, "admin@admin.com");
        User user2 = new User(1, "Jane", 31, "jane@mail.com");
        User user3 = new User(2, "John", 25, "john@mail.com");
        User user4 = new User(3, "Jimmy", 45, "jimmy@mail.com");

        // Add all the sample users to the userList.
        userList.addAll(Arrays.asList(user1,user2,user3,user4));
    }

    // This method tries to find a user by their ID.
    // It returns an Optional<User> which will contain the user if found, or be empty if not found.
    public Optional<User> getUser(Integer id) {
        Optional<User> optional = Optional.empty(); // Start with an empty Optional
        for(User user: userList){ // Loop through all users
            if(id == user.getId()) { // If the user's id matches the given id
                optional = Optional.of(user); // Put the user in the Optional
                return optional; // Return the Optional containing the user
            }
        }
        return optional; // If no user is found, return an empty Optional
    }

    // This method returns the entire list of users.
    public List<User> getUsers() {
        return userList;
    }

    // This method adds a new user to the list.
    public void addUser(User user) {
        userList.add(user);
    }

    // This method updates an existing user in the list.
    public void updateUser(Integer id, User user) {
        userList.set(id, user);
    }

    // This method removes a user from the list.
    public void removeUser(Integer id) {
        userList.removeIf(user -> user.getId() == id);
    }
}
