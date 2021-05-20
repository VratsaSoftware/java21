package movie;

import cast.Actor;
import cast.Director;

import java.util.List;

public class Movie {
    private String name;
    private int duration;
    private Director director;
    private Genre genre;
    private List<Actor> actors;

    public Movie(String name, int duration, Director director, Genre genre, List<Actor> actors) {
        this.name = name;
        this.duration = duration;
        this.director = director;
        this.genre = genre;
        this.actors = actors;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public Genre getGenre() {
        return genre;
    }

    public List<Actor> getActors() {
        return actors;
    }



}
