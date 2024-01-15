package com.moviestore.MoviestoreModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Genre {
    private int genreId;
    private String genreName;

    public Genre(String genreName){
        this.genreName=genreName;
    }
}
