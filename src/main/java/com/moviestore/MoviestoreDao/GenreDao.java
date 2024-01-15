package com.moviestore.MoviestoreDao;

import com.moviestore.MoviestoreModel.Genre;

import java.util.List;

public interface GenreDao {
    void createGenre(Genre genre);
    Genre getGenreById(int genreId);
    List<Genre> getGenreList();
    void updateGenreById(Genre genre);
    void deleteGenreById(int genreId);
}
