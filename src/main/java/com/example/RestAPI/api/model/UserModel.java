package com.example.RestAPI.api.model;

public class UserModel {
    private int id;
    private String name;
    private int age;
    private String email;

    // Constructor for User. This is called when you create a new User object.
    // It sets the id, name, age, and email fields based on the values you provide.
    public UserModel(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getter method for the id field. Returns the user's id.
    public int getId() {
        return id;
    }

    // Setter method for the id field. Allows you to change the user's id.
    public void setId(int id) {
        this.id = id;
    }

    // Getter method for the name field. Returns the user's name.
    public String getName(){
        return name;
    }

    // Setter method for the name field. Allows you to change the user's name.
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the age field. Returns the user's age.
    public int getAge(){
        return age;
    }

    // Setter method for the age field. Allows you to change the user's age.
    public void setAge(int age){
        this.age = age;
    }

    // Getter method for the email field. Returns the user's email address.
    public String getEmail(){
        return email;
    }

    // Setter method for the email field. Allows you to change the user's email address.
    public void setEmail(String email){
        this.email = email;
    }
}
