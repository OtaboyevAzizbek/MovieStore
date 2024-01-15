package com.moviestore.MoviestoreService;

import com.moviestore.MoviestoreDao.AuthorDaoImp;
import com.moviestore.MoviestoreModel.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImp implements AuthorService{

    @Autowired
    AuthorDaoImp authorDaoImp;

    @Override
    public void createAuthor(Author author) {
        authorDaoImp.createAuthor(author);
    }

    @Override
    public Author getAuthorById(int authorId) {
        return authorDaoImp.getAuthorById(authorId);
    }

    @Override
    public void updateAuthorById(Author author) {
        authorDaoImp.updateAuthorById(author);
    }

    @Override
    public void deleteAuthorById(int authorId) {
        authorDaoImp.deleteAuthorById(authorId);
    }

    @Override
    public List<Author> getAuthorList() {
        return authorDaoImp.getAuthorList();
    }
}
