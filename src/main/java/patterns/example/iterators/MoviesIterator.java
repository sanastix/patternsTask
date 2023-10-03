package patterns.example.iterators;

import java.util.ArrayList;
import java.util.List;

public class MoviesIterator implements InternalIterator{

    private final String filePath = "Movie_Catalogue.txt";
    private List<String> movies = new ArrayList<>();

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String getNext() {
        return null;
    }

}
