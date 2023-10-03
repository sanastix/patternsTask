package patterns.example;

import patterns.example.builder.Director;
import patterns.example.builder.MovieBuilder;

import java.util.List;

import static patterns.example.Movie.MovieType.*;


public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        MovieBuilder builder = new MovieBuilder();
        director.constructChildrensMovieItem(builder);
        Movie hp = new Movie(CHILDRENS, "Harry Potter", Movie.MovieGenre.COMEDY, "The UK", "Chris Columbus", "Emma Watson", "ytresdfghjnbvcdfg");

        List<Rental> rents = List.of(new Rental(hp, 1));

        Customer customer = new Customer("John Doe", 2365876, rents);
        String statement = customer.statement();

        System.out.println(statement);
    }
}