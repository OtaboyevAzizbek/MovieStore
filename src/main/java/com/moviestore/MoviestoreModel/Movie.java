package com.moviestore.MoviestoreModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Movie {
    private int movieId;
    private String movieName;
    private int genreId;
    private String movieYear;
    private int authorId;
    private String genreName;
    private String lastName;
    private String firstName;

    public Movie(String movieName,int genreId,String movieYear,int authorId){
        this.movieName=movieName;
        this.genreId=genreId;
        this.movieYear=movieYear;
        this.authorId=authorId;
    }

    public Movie(int movieId,String movieName,int genreId,String movieYear,int authorId){
        this.movieId=movieId;
        this.movieName=movieName;
        this.genreId=genreId;
        this.movieYear=movieYear;
        this.authorId=authorId;
    }
}
