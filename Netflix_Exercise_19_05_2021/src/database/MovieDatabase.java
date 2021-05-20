package database;

import cast.Actor;
import cast.Director;
import cast.Gender;
import movie.Genre;
import movie.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieDatabase {

    private List<Movie> movies;

    public MovieDatabase() {
        //new Movies[10];
        this.movies = new ArrayList<>();

        addCinderella();
        addBatman();
    }

    private void addCinderella() {
        List<Actor> cinderellaActors = new ArrayList<>();
        cinderellaActors.add(new Actor("Bella", 20, Gender.FEMALE, true));
        cinderellaActors.add(new Actor("Sarah", 25, Gender.FEMALE, false));

        movies.add(new Movie(
                "Cinderella",
                90,
                new Director("Mark",  35, Gender.MALE, 10),
                Genre.CARTOON,
                cinderellaActors));
    }

    private void addBatman() {
        List<Actor> batmanActor = new ArrayList<>();
        batmanActor.add(new Actor("Tom", 35, Gender.MALE, true));
        batmanActor.add(new Actor("Ben", 25, Gender.MALE, false));

        movies.add(new Movie(
                "Batman",
                110,
                new Director("Robert",  35, Gender.MALE, 10),
                Genre.ACTION,
                batmanActor));
    }

    public List<Movie> filter(String name) {
        List<Movie> foundMovies = new ArrayList<>();

        for (Movie movie: this.movies) {
            if(movie.getName().equals(name)) {
                foundMovies.add(movie);
            }
        }

        return foundMovies;
    }

    public List<Movie> filter(Genre genre) {
        List<Movie> foundMovies = new ArrayList<>();

        for (Movie movie: this.movies) {
            if(movie.getGenre() == genre) {
                foundMovies.add(movie);
            }
        }

        return foundMovies;
    }

    public List<Movie> filter(Director director) {
        List<Movie> foundMovies = new ArrayList<>();

        for (Movie movie: this.movies) {
            if(movie.getDirector().equals(director)) {
                foundMovies.add(movie);
            }
        }

        return foundMovies;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
