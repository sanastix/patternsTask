package patterns.example.strategysearch.moviesearch;

import patterns.example.strategysearch.SearchStrategy;

import java.util.List;
import java.util.Objects;

public class SearchByGenre implements SearchStrategy {

    private String genre;

    public SearchByGenre(String genre){
        this.genre = genre;
    }

    @Override
    public List<Objects> search() {
        return null;
    }

}
