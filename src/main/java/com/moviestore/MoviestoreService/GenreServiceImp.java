package com.moviestore.MoviestoreService;

import com.moviestore.MoviestoreDao.GenreDaoImp;
import com.moviestore.MoviestoreModel.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImp implements GenreService{

    @Autowired
    GenreDaoImp genreDaoImp;

    @Override
    public void createGenre(Genre genre) {
        genreDaoImp.createGenre(genre);
    }

    @Override
    public Genre getGenreById(int genreId) {
        return genreDaoImp.getGenreById(genreId);
    }

    @Override
    public List<Genre> getGenreList() {
        return genreDaoImp.getGenreList();
    }

    @Override
    public void updateGenreById(Genre genre) {
        genreDaoImp.updateGenreById(genre);
    }

    @Override
    public void deleteGenreById(int genreId) {
        genreDaoImp.deleteGenreById(genreId);
    }
}
