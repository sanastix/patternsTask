package patterns.example;

public class Movie {

    /*
    Movie is a product class
     */

    private int id = 0;
    private final String title;
    private final MovieGenre genre;
    private final String country;
    private final String director;
    private final String actors;
    private final String description;

    private final MovieType priceCode;

    public enum MovieGenre {
        DRAMA, COMEDY, THRILLER;
    }

    public enum MovieType {
        REGULAR, NEW_RELEASE, CHILDRENS;
    }

    public Movie(MovieType priceCode, String title, MovieGenre genre, String country, String director, String actors, String description) {
        id++;
        this.priceCode = priceCode;
        this.title = title;
        this.genre = genre;
        this.country = country;
        this.director = director;
        this.actors = actors;
        this.description = description;
    }

    public MovieType getPriceCode() {
        return priceCode;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public String getCountry() {
        return country;
    }

    public String getDirector() {
        return director;
    }

    public String getActors() {
        return actors;
    }

    public String getDescription() {
        return description;
    }
}