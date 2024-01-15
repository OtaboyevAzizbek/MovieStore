package com.moviestore.MoviestoreDao;

import com.moviestore.MoviestoreMapper.MovieMapper;
import com.moviestore.MoviestoreModel.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieDaoImp implements MovieDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void createMovie(Movie movie) {
        jdbcTemplate.update("INSERT INTO movie(movie_name, genre_id, movie_year, author_id) VALUES(?,?,?,?);",new Object[]{movie.getMovieName(),movie.getGenreId(),movie.getMovieYear(),movie.getAuthorId()});
    }

    @Override
    public Movie getMovieById(int movieId) {
        return jdbcTemplate.queryForObject("SELECT movie_id,movie_name,g.genre_id,g.genre_name,movie_year,a.author_id,a.first_name,a.last_name FROM movie m LEFT JOIN genre g on m.genre_id = g.genre_id LEFT JOIN author a on m.author_id = a.author_id WHERE m.movie_id=?;",new Object[]{movieId},new MovieMapper());
    }

    @Override
    public void updateMovieById(Movie movie) {
        jdbcTemplate.update("UPDATE movie SET movie_name=?,genre_id=?,movie_year=?,author_id=? WHERE movie_id=?;",new Object[]{movie.getMovieName(),movie.getGenreId(),movie.getMovieYear(),movie.getAuthorId(),movie.getMovieId()});
    }

    @Override
    public void deleteMovieById(int movieId) {
        jdbcTemplate.update("DELETE FROM movie WHERE movie_id=?;",new Object[]{movieId});
    }

    @Override
    public List<Movie> getMovieList() {
        return jdbcTemplate.query("SELECT movie_id,movie_name,g.genre_id,g.genre_name,movie_year,a.author_id,a.first_name,a.last_name FROM movie m LEFT JOIN genre g on m.genre_id = g.genre_id LEFT JOIN author a on m.author_id = a.author_id;",new MovieMapper());
    }
}
