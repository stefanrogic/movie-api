package com.example.RestAPI.service;
import com.example.RestAPI.api.model.UserModel;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.List;


@Service
public class UserService {
    // This field holds a list of User objects. It acts as our in-memory database for this example.
    private List<UserModel> userList;

    // Constructor for UserService. This is called when the service is created.
    public UserService() {
        // Initialize the userList as an empty ArrayList.
        userList = new ArrayList<>();

        // Add users
        userList.add(new UserModel(0, "Admin", 29, "admin@admin.com"));
        userList.add(new UserModel(1, "Jane", 31, "jane@mail.com"));
        userList.add(new UserModel(2, "John", 25, "john@mail.com"));
        userList.add(new UserModel(3, "Jimmy", 45, "jimmy@mail.com"));
        userList.add(new UserModel(4, "Alice", 22, "alice@mail.com"));
        userList.add(new UserModel(5, "Bob", 34, "bob@mail.com"));
        userList.add(new UserModel(6, "Charlie", 28, "charlie@mail.com"));
        userList.add(new UserModel(7, "Diana", 27, "diana@mail.com"));
        userList.add(new UserModel(8, "Eve", 30, "eve@mail.com"));
        userList.add(new UserModel(9, "Frank", 41, "frank@mail.com"));
        userList.add(new UserModel(10, "Grace", 36, "grace@mail.com"));
        userList.add(new UserModel(11, "Hank", 24, "hank@mail.com"));
        userList.add(new UserModel(12, "Ivy", 33, "ivy@mail.com"));
        userList.add(new UserModel(13, "Jack", 26, "jack@mail.com"));
        userList.add(new UserModel(14, "Karen", 38, "karen@mail.com"));
        userList.add(new UserModel(15, "Leo", 29, "leo@mail.com"));
        userList.add(new UserModel(16, "Mona", 32, "mona@mail.com"));
        userList.add(new UserModel(17, "Nina", 23, "nina@mail.com"));
        userList.add(new UserModel(18, "Oscar", 40, "oscar@mail.com"));
        userList.add(new UserModel(19, "Paul", 35, "paul@mail.com"));
        userList.add(new UserModel(20, "Quinn", 31, "quinn@mail.com"));
        userList.add(new UserModel(21, "Rita", 28, "rita@mail.com"));
        userList.add(new UserModel(22, "Sam", 37, "sam@mail.com"));
        userList.add(new UserModel(23, "Tina", 25, "tina@mail.com"));
        userList.add(new UserModel(24, "Uma", 39, "uma@mail.com"));
        userList.add(new UserModel(25, "Vince", 27, "vince@mail.com"));
    }

    // This method tries to find a user by their ID.
    // It returns an Optional<User> which will contain the user if found, or be empty if not found.
    public Optional<UserModel> getUser(Integer id) {
        Optional<UserModel> optional = Optional.empty(); // Start with an empty Optional
        for(UserModel user: userList){ // Loop through all users
            if(id == user.getId()) { // If the user's id matches the given id
                optional = Optional.of(user); // Put the user in the Optional
                return optional; // Return the Optional containing the user
            }
        }
        return optional; // If no user is found, return an empty Optional
    }

    // This method returns the entire list of users.
    public List<UserModel> getUsers() {
        return userList;
    }

    // This method adds a new user to the list.
    public void addUser(UserModel user) {
        userList.add(user);
    }

    // This method updates an existing user in the list.
    public void updateUser(Integer id, UserModel user) {
        userList.set(id, user);
    }

    // This method removes a user from the list.
    public void removeUser(Integer id) {
        userList.removeIf(user -> user.getId() == id);
    }
}
