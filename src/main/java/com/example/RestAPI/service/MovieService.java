package com.example.RestAPI.service;
import com.example.RestAPI.api.model.MovieModel;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

@Service
public class MovieService {
    // This field holds a list of Movie objects. It acts as our in-memory database for this example.
    private List<MovieModel> movieList;

    // Constructor for MovieService. This is called when the service is created.
    public MovieService() {
        // Initialize the movieList as an empty ArrayList.
        movieList = new ArrayList<>();

        // Add movies
        movieList.add(new MovieModel(0, "The Shawshank Redemption", "Frank Darabont", 1994, "Drama", Arrays.asList(
            new MovieModel.ActorRole("Tim Robbins", "Andy Dufresne"),
            new MovieModel.ActorRole("Morgan Freeman", "Ellis Boyd 'Red' Redding"),
            new MovieModel.ActorRole("Bob Gunton", "Warden Norton")
        ), Arrays.asList(
            "Hope is a good thing, maybe the best of things, and no good thing ever dies.",
            "Get busy living, or get busy dying.",
            "I guess it comes down to a simple choice, really. Get busy living or get busy dying."
        )));
        movieList.add(new MovieModel(1, "The Godfather", "Francis Ford Coppola", 1972, "Crime", Arrays.asList(
            new MovieModel.ActorRole("Marlon Brando", "Don Vito Corleone"),
            new MovieModel.ActorRole("Al Pacino", "Michael Corleone"),
            new MovieModel.ActorRole("James Caan", "Sonny Corleone")
        ), Arrays.asList(
            "I'm gonna make him an offer he can't refuse.",
            "Keep your friends close, but your enemies closer.",
            "A man who doesn't spend time with his family can never be a real man."
        )));
        movieList.add(new MovieModel(2, "The Dark Knight", "Christopher Nolan", 2008, "Action", Arrays.asList(
            new MovieModel.ActorRole("Christian Bale", "Bruce Wayne / Batman"),
            new MovieModel.ActorRole("Heath Ledger", "Joker"),
            new MovieModel.ActorRole("Aaron Eckhart", "Harvey Dent")
        ), Arrays.asList(
            "Why so serious?",
            "You either die a hero, or you live long enough to see yourself become the villain.",
            "I'm not a hero. I'm whatever Gotham needs me to be."
        )));
        movieList.add(new MovieModel(3, "Pulp Fiction", "Quentin Tarantino", 1994, "Crime", Arrays.asList(
            new MovieModel.ActorRole("John Travolta", "Vincent Vega"),
            new MovieModel.ActorRole("Uma Thurman", "Mia Wallace"),
            new MovieModel.ActorRole("Samuel L. Jackson", "Jules Winnfield")
        ), Arrays.asList(
            "Say 'what' again. Say 'what' again, I dare you, I double dare you motherfucker, say what one more Goddamn time!",
            "Royale with cheese.",
            "I'm gonna get medieval on your ass."
        )));
        movieList.add(new MovieModel(4, "Forrest Gump", "Robert Zemeckis", 1994, "Drama", Arrays.asList(
            new MovieModel.ActorRole("Tom Hanks", "Forrest Gump"),
            new MovieModel.ActorRole("Robin Wright", "Jenny Curran"),
            new MovieModel.ActorRole("Gary Sinise", "Lieutenant Dan Taylor")
        ), Arrays.asList(
            "Life is like a box of chocolates. You never know what you're gonna get.",
            "Run, Forrest, run!",
            "Mama always said life was like a box of chocolates. You never know what you're gonna get."
        )));
        movieList.add(new MovieModel(5, "Inception", "Christopher Nolan", 2010, "Sci-Fi", Arrays.asList(
            new MovieModel.ActorRole("Leonardo DiCaprio", "Dom Cobb"),
            new MovieModel.ActorRole("Joseph Gordon-Levitt", "Arthur"),
            new MovieModel.ActorRole("Ellen Page", "Ariadne")
        ), Arrays.asList(
            "We need to go deeper.",
            "What's the most resilient parasite? An idea.",
            "You mustn't be afraid to dream a little bigger, darling."
        )));
        movieList.add(new MovieModel(6, "Fight Club", "David Fincher", 1999, "Drama", Arrays.asList(
            new MovieModel.ActorRole("Brad Pitt", "Tyler Durden"),
            new MovieModel.ActorRole("Edward Norton", "The Narrator"),
            new MovieModel.ActorRole("Helena Bonham Carter", "Marla Singer")
        ), Arrays.asList(
            "The first rule of Fight Club is: You do not talk about Fight Club.",
            "I am Jack's complete lack of surprise.",
            "We buy things we don't need with money we don't have to impress people we don't like."
        )));
        movieList.add(new MovieModel(7, "The Matrix", "Lana Wachowski, Lilly Wachowski", 1999, "Sci-Fi", Arrays.asList(
            new MovieModel.ActorRole("Keanu Reeves", "Neo"),
            new MovieModel.ActorRole("Laurence Fishburne", "Morpheus"),
            new MovieModel.ActorRole("Carrie-Anne Moss", "Trinity")
        ), Arrays.asList(
            "Unfortunately, no one can be told what the Matrix is. You have to see it for yourself.",
            "There is no spoon.",
            "I know kung fu."
        )));
        movieList.add(new MovieModel(8, "Goodfellas", "Martin Scorsese", 1990, "Crime", Arrays.asList(
            new MovieModel.ActorRole("Robert De Niro", "James Conway"),
            new MovieModel.ActorRole("Ray Liotta", "Henry Hill"),
            new MovieModel.ActorRole("Joe Pesci", "Tommy DeVito")
        ), Arrays.asList(
            "As far back as I can remember, I always wanted to be a gangster.",
            "Funny how?",
            "Never rat on your friends and always keep your mouth shut."
        )));
        movieList.add(new MovieModel(9, "The Lord of the Rings: The Return of the King", "Peter Jackson", 2003, "Fantasy", Arrays.asList(
            new MovieModel.ActorRole("Elijah Wood", "Frodo Baggins"),
            new MovieModel.ActorRole("Viggo Mortensen", "Aragorn"),
            new MovieModel.ActorRole("Ian McKellen", "Gandalf")
        ), Arrays.asList(
            "My precious...",
            "You shall not pass!",
            "One ring to rule them all, one ring to find them, one ring to bring them all and in the darkness bind them."
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

    // This method returns the next available movie ID.
    // private int getNextId() {
    //     int maxId = -1;

    //     for (MovieModel movie : movieList) {
    //         if (movie.getId() > maxId) {
    //             maxId = movie.getId();
    //         }
    //     }
        
    //     return maxId + 1;
    // }

    // Size could be used but it wouldn't work if we delete a movie.
    private int getNextId() {
        // Collect all current IDs
        Set<Integer> usedIds = new HashSet<>();
        for (MovieModel movie : movieList) {
            usedIds.add(movie.getId());
        }
        // Find the smallest unused ID
        int nextId = 0;
        while (usedIds.contains(nextId)) {
            nextId++;
        }
        return nextId;
    }

    // This method adds a new movie to the list.
    public void addMovie(MovieModel movie) {
        movie.setId(getNextId());
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
