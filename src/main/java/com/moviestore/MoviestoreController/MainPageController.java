package com.moviestore.MoviestoreController;

import com.moviestore.MoviestoreModel.Author;
import com.moviestore.MoviestoreModel.Genre;
import com.moviestore.MoviestoreModel.Movie;
import com.moviestore.MoviestoreService.AuthorService;
import com.moviestore.MoviestoreService.GenreService;
import com.moviestore.MoviestoreService.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MainPageController {

    @Autowired
    GenreService genreService;

    @Autowired
    AuthorService authorService;

    @Autowired
    MovieService movieService;

    @PostMapping("/create_genre")
    public void createGenre(@RequestParam("genreName") String genreName){
        genreService.createGenre(new Genre(genreName));
    }

    @GetMapping("/view_genre")
    public Genre getGenre(@RequestParam("genreId") int genreId){
        return genreService.getGenreById(genreId);
    }

    @PostMapping("/update_genre")
    public void updateGenre(@RequestParam("genreId") int genreId,@RequestParam("genreName") String genreName){
        genreService.updateGenreById(new Genre(genreId,genreName));
    }

    @GetMapping("/delete_genre")
    public void deleteGenre(@RequestParam("genreId") int genreId){
        genreService.deleteGenreById(genreId);
    }

    @GetMapping("/view_genreList")
    public List<Genre> getGenreList(){
        return genreService.getGenreList();
    }

    @PostMapping("/create_author")
    public void createAuthor(@RequestParam("lastName") String lastName,@RequestParam("firstName") String firstName){
        authorService.createAuthor(new Author(firstName,lastName));
    }

    @GetMapping("/view_author")
    public Author getAuthor(@RequestParam("authorId") int authorId){
        return authorService.getAuthorById(authorId);
    }

    @PostMapping("/update_author")
    public void updateAuthor(@RequestParam("authorId") int authorId,@RequestParam("lastName") String lastName,@RequestParam("firstName") String firstName){
        authorService.updateAuthorById(new Author(authorId,firstName,lastName));
    }

    @GetMapping("/delete_author")
    public void deleteAuthor(@RequestParam("authorId") int authorId){
        authorService.deleteAuthorById(authorId);
    }

    @GetMapping("/view_authorList")
    public List<Author> getAuthorList(){
        return authorService.getAuthorList();
    }

    @PostMapping("/create_movie")
    public void createMovie(@RequestParam("movieName") String movieName,@RequestParam("genreId") int genreId,@RequestParam("movieYear") String movieYear,@RequestParam("authorId") int authorId){
        movieService.createMovie(new Movie(movieName,genreId,movieYear,authorId));
    }

    @GetMapping("/view_movie")
    public Movie getMovie(@RequestParam("movieId") int movieId){
        return movieService.getMovieById(movieId);
    }

    @PostMapping("/update_movie")
    public void updateMovie(@RequestParam("movieId") int movieId,@RequestParam("movieName") String movieName,@RequestParam("genreId") int genreId,@RequestParam("movieYear") String movieYear,@RequestParam("authorId") int authorId){
        movieService.updateMovieById(new Movie(movieId,movieName,genreId,movieYear,authorId));
    }

    @GetMapping("/delete_movie")
    public void deleteMovie(@RequestParam("movieId") int movieId){
        movieService.deleteMovieById(movieId);
    }

    @GetMapping("/view_movieList")
    public List<Movie> getMovieList(){
        return movieService.getMovieList();
    }
}
