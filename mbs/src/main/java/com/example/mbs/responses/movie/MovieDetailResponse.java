package com.example.mbs.responses.movie;

import com.example.mbs.constants.MovieStatus;
import com.example.mbs.models.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDetailResponse {
    private Integer movieId;
    private String title;
    private String description;
    private String rated;
    private Short durationInMins;
    private String posterUrl;
    private String trailerUrl;
    private LocalDate releaseDate;
    private String genre;
    private String director;
    private String cast;
    private String languages;
    private MovieStatus movieStatus;
    public MovieDetailResponse(Movie movie) {
        this.movieId =  movie.getMovieId();
        this.title = movie.getTitle();
        this.description = movie.getDescription();
        this.rated = movie.getRated();
        this.durationInMins = movie.getDurationInMins();
        this.posterUrl = movie.getPosterUrl();
        this.trailerUrl =  movie.getTrailerUrl();
        this.releaseDate =  movie.getReleaseDate();
        this.genre = movie.getGenre();
        this.director = movie.getDirector();
        this.cast = movie.getCast();
        this.languages = movie.getLanguages();
        this.movieStatus = movie.getMovieStatus();
    }

}

