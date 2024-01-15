package com.moviestore.MoviestoreDao;

import com.moviestore.MoviestoreMapper.AuthorMapper;
import com.moviestore.MoviestoreModel.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorDaoImp implements AuthorDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void createAuthor(Author author) {
        jdbcTemplate.update("INSERT INTO author(first_name, last_name) VALUES(?,?);",new Object[]{author.getFirstName(),author.getLastName()});
    }

    @Override
    public Author getAuthorById(int authorId) {
        return jdbcTemplate.queryForObject("SELECT * FROM author WHERE author_id=?;",new Object[]{authorId},new AuthorMapper());
    }

    @Override
    public void updateAuthorById(Author author) {
        jdbcTemplate.update("UPDATE author SET first_name=?,last_name=? WHERE author_id=?;",new Object[]{author.getFirstName(),author.getLastName(),author.getAuthorId()});
    }

    @Override
    public void deleteAuthorById(int authorId) {
        jdbcTemplate.update("DELETE FROM author WHERE author_id=?;",new Object[]{authorId});
    }

    @Override
    public List<Author> getAuthorList() {
        return jdbcTemplate.query("SELECT * FROM author;",new AuthorMapper());
    }
}
