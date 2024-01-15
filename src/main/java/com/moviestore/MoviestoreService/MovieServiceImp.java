package com.moviestore.MoviestoreService;

import com.moviestore.MoviestoreDao.MovieDao;
import com.moviestore.MoviestoreModel.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImp implements MovieService{

    @Autowired
    MovieDao movieDao;

    @Override
    public void createMovie(Movie movie) {
        movieDao.createMovie(movie);
    }

    @Override
    public Movie getMovieById(int movieId) {
        return movieDao.getMovieById(movieId);
    }

    @Override
    public void updateMovieById(Movie movie) {
        movieDao.updateMovieById(movie);
    }

    @Override
    public void deleteMovieById(int movieId) {
        movieDao.deleteMovieById(movieId);
    }

    @Override
    public List<Movie> getMovieList() {
        return movieDao.getMovieList();
    }
}
