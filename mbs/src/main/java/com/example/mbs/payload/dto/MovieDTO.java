package com.example.mbs.payload.dto;

import com.example.mbs.models.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO {
    private String title;
    private String posterUrl;
    public static MovieDTO from(Movie movie)
    {
        MovieDTO movieDTO = new MovieDTO();
        movieDTO.setTitle(movie.getTitle());
        movieDTO.setPosterUrl(movie.getPosterUrl());
        return movieDTO;
    }
}
