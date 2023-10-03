package patterns.example.strategysearch;

import java.util.List;
import java.util.Objects;

public class SearchById implements SearchStrategy {

    private int id;
    private final String moviesFilePath = "Movie_Catalogue.txt";
    private final String customersFilePath = "Customers.txt";

    public SearchById(int id){
        this.id = id;
    }

    @Override
    public List<Objects> search() {

        return null;
    }

}
