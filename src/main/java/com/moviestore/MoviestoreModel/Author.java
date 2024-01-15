package com.moviestore.MoviestoreModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Author {
    private int authorId;
    private String firstName;
    private String lastName;

    public Author(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
}
