package patterns.example.strategysearch.moviesearch;

import patterns.example.Movie;
import patterns.example.strategysearch.SearchStrategy;

import java.util.List;
import java.util.Objects;

public class SearchByMovieType implements SearchStrategy {

    private Movie.MovieType movieType;

    private enum MovieType {
        REGULAR, NEW_RELEASE, CHILDRENS;
    }

    public SearchByMovieType(Movie.MovieType movieType){
        this.movieType = movieType;
    }

    @Override
    public List<Objects> search() {
        return null;
    }

}
