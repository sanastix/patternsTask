package patterns.example.strategysearch.customersearch;

import patterns.example.strategysearch.SearchStrategy;

import java.util.List;
import java.util.Objects;

public class SearchByName implements SearchStrategy {

    private String name;

    public SearchByName(String name){
        this.name = name;
    }

    @Override
    public List<Objects> search() {
        return null;
    }

}
