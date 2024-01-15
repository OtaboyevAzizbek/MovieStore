package com.moviestore.MoviestoreMapper;

import com.moviestore.MoviestoreModel.Movie;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieMapper implements RowMapper<Movie> {
    @Override
    public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Movie(rs.getInt("movie_id"),rs.getString("movie_name"),rs.getInt("genre_id"),rs.getString("movie_year"),rs.getInt("author_id"),rs.getString("genre_name"),rs.getString("last_name"),rs.getString("first_name"));
    }
}
