package com.moviestore.MoviestoreDao;

import com.moviestore.MoviestoreModel.Movie;

import java.util.List;

public interface MovieDao {
    void createMovie(Movie movie);
    Movie getMovieById(int movieId);
    void updateMovieById(Movie movie);
    void deleteMovieById(int movieId);
    List<Movie> getMovieList();
}
