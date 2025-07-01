package com.example.RestAPI.api.model;

import java.util.List;

public class MovieModel {
    private int id;
    private String title;
    private String director;
    private int year;
    private String genre;
    private List<ActorRole> actors;
    private List<String> quotes;

    // This is a nested class that represents an actor and their role in a movie.
    public static class ActorRole {
        private String name;
        private String role;

        public ActorRole(String name, String role) {
            this.name = name;
            this.role = role;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }
    }

    // Constructor for Movie. This is called when you create a new Movie object.
    // It sets the id, title, director, year, genre, actors, and quotes fields based on the values you provide.
    public MovieModel(int id, String title, String director, int year, String genre, List<ActorRole> actors, List<String> quotes) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.year = year;
        this.genre = genre;
        this.actors = actors;
        this.quotes = quotes;
    }

    // Getter method for the id field. Returns the movie's id.
    public int getId() {
        return id;
    }

    // Setter method for the id field. Allows you to change the movie's id.
    public void setId(int id) {
        this.id = id;
    }

    // Getter method for the title field. Returns the movie's title.
    public String getTitle() {
        return title;
    }

    // Setter method for the title field. Allows you to change the movie's title.
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter method for the director field. Returns the movie's director.
    public String getDirector() {
        return director;
    }

    // Setter method for the director field. Allows you to change the movie's director.
    public void setDirector(String director) {
        this.director = director;
    }

    // Getter method for the year field. Returns the movie's year.
    public int getYear() {
        return year;
    }

    // Setter method for the year field. Allows you to change the movie's year.
    public void setYear(int year) {
        this.year = year;
    }

    // Getter method for the genre field. Returns the movie's genre.
    public String getGenre() {
        return genre;
    }

    // Setter method for the genre field. Allows you to change the movie's genre.
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<ActorRole> getActors() {
        return actors;
    }

    public void setActors(List<ActorRole> actors) {
        this.actors = actors;
    }

    public List<String> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<String> quotes) {
        this.quotes = quotes;
    }
}
