package patterns.example.iterators;

import java.util.ArrayList;
import java.util.List;

public class CustomersIterator implements InternalIterator {

    private final String filePath = "Customers.txt";
    private List<String> customers = new ArrayList<>();

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String getNext() {
        return null;
    }

}
