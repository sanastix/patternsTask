package patterns.example.builder;

import patterns.example.Movie;

public class MovieBuilder implements Builder {

    /*
    Concrete builders implement steps defined in the Builder interface
     */

    private int id;
    private String title;
    private Movie.MovieGenre genre;
    private String country;
    private String director;
    private String actors;
    private String description;

    private Movie.MovieType priceCode;

    public MovieBuilder(){

    }

    @Override
    public void setPriceCode(Movie.MovieType priceCode){
        this.priceCode = priceCode;
    }

    @Override
    public void setId() {
        id++;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setGenre(Movie.MovieGenre genre) {
        this.genre = genre;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void setActors(String actors) {
        this.actors = actors;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public Movie getResult(){
        return new Movie(priceCode, title, genre, country, director, actors, description);
    }

}
