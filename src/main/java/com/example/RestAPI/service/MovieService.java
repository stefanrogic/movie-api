package com.example.RestAPI.service;
import com.example.RestAPI.api.model.MovieModel;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.List;

@Service
public class MovieService {
    // This field holds a list of Movie objects. It acts as our in-memory database for this example.
    private List<MovieModel> movieList;

    // Constructor for MovieService. This is called when the service is created.
    public MovieService() {
        // Initialize the movieList as an empty ArrayList.
        movieList = new ArrayList<>();

        // Add movies with actors and their roles
        movieList.add(new MovieModel(0, "The Shawshank Redemption", "Frank Darabont", 1994, "Drama", Arrays.asList(
            new MovieModel.ActorRole("Tim Robbins", "Andy Dufresne"),
            new MovieModel.ActorRole("Morgan Freeman", "Ellis Boyd 'Red' Redding"),
            new MovieModel.ActorRole("Bob Gunton", "Warden Norton")
        )));
        movieList.add(new MovieModel(1, "The Godfather", "Francis Ford Coppola", 1972, "Crime", Arrays.asList(
            new MovieModel.ActorRole("Marlon Brando", "Don Vito Corleone"),
            new MovieModel.ActorRole("Al Pacino", "Michael Corleone"),
            new MovieModel.ActorRole("James Caan", "Sonny Corleone")
        )));
        movieList.add(new MovieModel(2, "The Dark Knight", "Christopher Nolan", 2008, "Action", Arrays.asList(
            new MovieModel.ActorRole("Christian Bale", "Bruce Wayne / Batman"),
            new MovieModel.ActorRole("Heath Ledger", "Joker"),
            new MovieModel.ActorRole("Aaron Eckhart", "Harvey Dent")
        )));
        movieList.add(new MovieModel(3, "Pulp Fiction", "Quentin Tarantino", 1994, "Crime", Arrays.asList(
            new MovieModel.ActorRole("John Travolta", "Vincent Vega"),
            new MovieModel.ActorRole("Uma Thurman", "Mia Wallace"),
            new MovieModel.ActorRole("Samuel L. Jackson", "Jules Winnfield")
        )));
        movieList.add(new MovieModel(4, "Forrest Gump", "Robert Zemeckis", 1994, "Drama", Arrays.asList(
            new MovieModel.ActorRole("Tom Hanks", "Forrest Gump"),
            new MovieModel.ActorRole("Robin Wright", "Jenny Curran"),
            new MovieModel.ActorRole("Gary Sinise", "Lieutenant Dan Taylor")
        )));
        movieList.add(new MovieModel(5, "Inception", "Christopher Nolan", 2010, "Sci-Fi", Arrays.asList(
            new MovieModel.ActorRole("Leonardo DiCaprio", "Dom Cobb"),
            new MovieModel.ActorRole("Joseph Gordon-Levitt", "Arthur"),
            new MovieModel.ActorRole("Ellen Page", "Ariadne")
        )));
        movieList.add(new MovieModel(6, "Fight Club", "David Fincher", 1999, "Drama", Arrays.asList(
            new MovieModel.ActorRole("Brad Pitt", "Tyler Durden"),
            new MovieModel.ActorRole("Edward Norton", "The Narrator"),
            new MovieModel.ActorRole("Helena Bonham Carter", "Marla Singer")
        )));
        movieList.add(new MovieModel(7, "The Matrix", "Lana Wachowski, Lilly Wachowski", 1999, "Sci-Fi", Arrays.asList(
            new MovieModel.ActorRole("Keanu Reeves", "Neo"),
            new MovieModel.ActorRole("Laurence Fishburne", "Morpheus"),
            new MovieModel.ActorRole("Carrie-Anne Moss", "Trinity")
        )));
        movieList.add(new MovieModel(8, "Goodfellas", "Martin Scorsese", 1990, "Crime", Arrays.asList(
            new MovieModel.ActorRole("Robert De Niro", "James Conway"),
            new MovieModel.ActorRole("Ray Liotta", "Henry Hill"),
            new MovieModel.ActorRole("Joe Pesci", "Tommy DeVito")
        )));
        movieList.add(new MovieModel(9, "The Lord of the Rings: The Return of the King", "Peter Jackson", 2003, "Fantasy", Arrays.asList(
            new MovieModel.ActorRole("Elijah Wood", "Frodo Baggins"),
            new MovieModel.ActorRole("Viggo Mortensen", "Aragorn"),
            new MovieModel.ActorRole("Ian McKellen", "Gandalf")
        )));
    }

    // This method tries to find a movie by its ID.
    public Optional<MovieModel> getMovie(Integer id) {
        Optional<MovieModel> optional = Optional.empty();
        for(MovieModel movie: movieList){
            if(id == movie.getId()) {
                optional = Optional.of(movie);
                return optional;
            }
        }
        return optional;
    }

    // This method returns the entire list of movies.
    public List<MovieModel> getMovies() {
        return movieList;
    }

    // This method adds a new movie to the list.
    public void addMovie(MovieModel movie) {
        movieList.add(movie);
    }

    // This method updates an existing movie in the list.
    public void updateMovie(Integer id, MovieModel movie) {
        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).getId() == id) {
                movieList.set(i, movie);
                return;
            }
        }
    }

    // This method removes a movie from the list.
    public void removeMovie(Integer id) {
        movieList.removeIf(movie -> movie.getId() == id);
    }
}
