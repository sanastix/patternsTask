package patterns.example.builder;

import patterns.example.Movie;

public interface Builder {

    /*
    Builder interface defines all possible ways to configure a movie
     */

    void setPriceCode(Movie.MovieType priceCode);
    void setId();
    void setTitle(String title);
    void setGenre(Movie.MovieGenre genre);
    void setCountry(String country);
    void setDirector(String director);
    void setActors(String actors);
    void setDescription(String description);

}
