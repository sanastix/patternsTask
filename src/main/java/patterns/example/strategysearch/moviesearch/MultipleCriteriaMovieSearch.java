package patterns.example.strategysearch.moviesearch;

import patterns.example.strategysearch.SearchStrategy;

import java.util.List;
import java.util.Objects;

public class MultipleCriteriaMovieSearch implements SearchStrategy {

    private int id;
    private String title;
    private String genre;
    private String country;
    private String director;

    public MultipleCriteriaMovieSearch(int id, String title){
        this.id = id;
        this.title = title;
    }

    public MultipleCriteriaMovieSearch(int id, String title, String genre){
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public MultipleCriteriaMovieSearch(int id, String title, String genre, String country){
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.country = country;
    }

    public MultipleCriteriaMovieSearch(int id, String title, String genre, String country, String director){
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.country = country;
        this.director = director;
    }

    @Override
    public List<Objects> search() {
        return null;
    }

}
