package com.moviestore.MoviestoreDao;

import com.moviestore.MoviestoreModel.Author;

import java.util.List;

public interface AuthorDao {
    void createAuthor(Author author);
    Author getAuthorById(int authorId);
    void updateAuthorById(Author author);
    void deleteAuthorById(int authorId);
    List<Author> getAuthorList();
}
