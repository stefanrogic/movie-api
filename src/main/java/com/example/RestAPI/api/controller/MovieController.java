package com.example.RestAPI.api.controller;

import com.example.RestAPI.api.model.MovieModel;
import com.example.RestAPI.service.MovieService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
import java.util.List;


// This annotation tells Spring that this class will handle REST API requests
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Allow all origins for development
public class MovieController {
    // This field holds a reference to the MovieService, which provides movie-related operations
    private MovieService movieService;

    // Constructor for MovieController. Spring will automatically provide a MovieService instance when creating this controller.
    public MovieController(MovieService movieService){
        // Assign the provided MovieService to the field so it can be used in the methods below
        this.movieService = movieService;
    }

    // This method handles GET requests to /movies and returns a list of all movies
    @GetMapping("/movies")
    public List<MovieModel> getMovies() {
        // Calls the MovieService to get all movies and returns the list
        return movieService.getMovies();
    }

    // This method handles GET requests to /movie/{id} and returns a single movie by its ID
    @GetMapping("/movie/{id}")
    public MovieModel getMovie(@PathVariable Integer id) {
        // Calls the MovieService to get a movie by ID. The result is wrapped in an Optional to handle the case where the movie might not exist.
        Optional<MovieModel> movie = movieService.getMovie(id);

        // If a movie with the given ID exists, return it
        if(movie.isPresent()) {
            return movie.get();
        }

        // If no movie is found, return null (could also return an error or a special response in a real app)
        return null;
    }

    // This method handles POST requests to /movies and adds a new movie
    // !FIXME: There should be validation here
    @PostMapping("/movies")
    public void addMovie(@RequestBody MovieModel movie) {
        movieService.addMovie(movie);
    }

    // This method handles PUT requests to /movies/{id} and updates a movie by its ID
    // !FIXME: There should be validation here
    @PutMapping("/movies/{id}")
    public void updateMovie(@PathVariable Integer id, @RequestBody MovieModel movie) {
        movieService.updateMovie(id, movie);
    }

    // This method handles DELETE requests to /movies/{id} and removes a movie by its ID
    @DeleteMapping("/movies/{id}")
    public void removeMovie(@PathVariable Integer id) {
        movieService.removeMovie(id);
    }
}
