package patterns.example.strategysearch.customersearch;

import patterns.example.strategysearch.SearchStrategy;

import java.util.List;
import java.util.Objects;

public class MultipleCriteriaCustomerSearch implements SearchStrategy {

    private int id;
    private String name;

    public MultipleCriteriaCustomerSearch(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public List<Objects> search() {
        return null;
    }

}
