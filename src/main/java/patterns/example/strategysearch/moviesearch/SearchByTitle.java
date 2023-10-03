package patterns.example.strategysearch.moviesearch;

import patterns.example.strategysearch.SearchStrategy;

import java.util.List;
import java.util.Objects;

public class SearchByTitle implements SearchStrategy {

    private String title;

    public SearchByTitle(String title){
        this.title = title;
    }

    @Override
    public List<Objects> search() {
        return null;
    }

}
