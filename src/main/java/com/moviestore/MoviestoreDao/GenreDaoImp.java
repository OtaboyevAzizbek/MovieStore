package com.moviestore.MoviestoreDao;

import com.moviestore.MoviestoreMapper.GenreMapper;
import com.moviestore.MoviestoreModel.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GenreDaoImp implements GenreDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void createGenre(Genre genre) {
        jdbcTemplate.update("INSERT INTO genre(genre_name) VALUES(?);",new Object[]{genre.getGenreName()});
    }

    @Override
    public Genre getGenreById(int genreId) {
        return jdbcTemplate.queryForObject("SELECT * FROM genre WHERE genre_id=?;",new Object[]{genreId},new GenreMapper());
    }

    @Override
    public List<Genre> getGenreList() {
        return jdbcTemplate.query("SELECT * FROM genre;",new GenreMapper());
    }

    @Override
    public void updateGenreById(Genre genre) {
        jdbcTemplate.update("UPDATE genre SET genre_name=? WHERE genre_id=?;",new Object[]{genre.getGenreName(),genre.getGenreId()});
    }

    @Override
    public void deleteGenreById(int genreId) {
        jdbcTemplate.update("DELETE FROM genre WHERE genre_id=?;",new Object[]{genreId});
    }
}
