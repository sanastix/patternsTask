package patterns.example;

public class Manual {

    /*
    Gives info about the Movie.
    Can be used to save info to movies database or to show result of the searching
     */

    private int id = 0;
    private final String title;
    private final String genre;
    private final String country;
    private final String director;
    private final String actors;
    private final String description;

    private final Movie.MovieType priceCode;

    public Manual(Movie.MovieType priceCode, String title, String genre, String country, String director, String actors, String description) {
        id++;
        this.priceCode = priceCode;
        this.title = title;
        this.genre = genre;
        this.country = country;
        this.director = director;
        this.actors = actors;
        this.description = description;
    }

    public String print(){
        String info = "";

        info += "Movie ID: " + id + "\n";
        info += "Price code: " + priceCode + "\n";
        info += "Title: " + title + "\n";
        info += "Genre: " + genre + "\n";
        info += "Country: " + country + "\n";
        info += "Director: " + director + "\n";
        info += "Actors: " + actors + "\n";
        info += "Description: " + description + "\n";

        return info;
    }

}
