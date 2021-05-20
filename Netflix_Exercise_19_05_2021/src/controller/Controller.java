package controller;

import database.MovieDatabase;
import io.IOModule;
import movie.Movie;

import java.util.List;

public class Controller {

    private MovieDatabase database;
    private IOModule ioModule;

    public Controller(MovieDatabase database, IOModule ioModule) {
        this.database = database;
        this.ioModule = ioModule;
    }

    public void filter(String movieName) {
        List<Movie> foundMovies = this.database.filter(movieName);
        if(foundMovies.isEmpty()) {
            ioModule.write("No movies were found");
        } else {
            for (Movie movie : foundMovies) {
                ioModule.write(movie.getName() + " " + movie.getDirector().getName());
            }
        }
    }

}
