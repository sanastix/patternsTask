package patterns.example.builder;

import patterns.example.Movie;
import patterns.example.builder.Builder;

import java.util.Scanner;

public class Director {

    /*
    Director defines the order of building steps.
    It works with a builder object through common Builder interface,
    so it may not know what product is being built.
     */

    Scanner in = new Scanner(System.in);

    public void constructRegularMovieItem(Builder builder){
        builder.setId();
        builder.setPriceCode(Movie.MovieType.REGULAR);
        builder.setTitle(in.nextLine());
        builder.setGenre(Movie.MovieGenre.valueOf(in.nextLine()));
        builder.setCountry(in.nextLine());
        builder.setDirector(in.nextLine());
        builder.setActors(in.nextLine());
        builder.setDescription(in.nextLine());
    }

    public void constructNewReleaseMovieItem(Builder builder) {
        builder.setId();
        builder.setPriceCode(Movie.MovieType.NEW_RELEASE);
        builder.setTitle(in.nextLine());
        builder.setGenre(Movie.MovieGenre.valueOf(in.nextLine()));
        builder.setCountry(in.nextLine());
        builder.setDirector(in.nextLine());
        builder.setActors(in.nextLine());
        builder.setDescription(in.nextLine());
    }

    public void constructChildrensMovieItem(Builder builder) {
        builder.setId();
        builder.setPriceCode(Movie.MovieType.CHILDRENS);
        builder.setTitle(in.nextLine());
        builder.setGenre(Movie.MovieGenre.valueOf(in.nextLine()));
        builder.setCountry(in.nextLine());
        builder.setDirector(in.nextLine());
        builder.setActors(in.nextLine());
        builder.setDescription(in.nextLine());
    }

}
