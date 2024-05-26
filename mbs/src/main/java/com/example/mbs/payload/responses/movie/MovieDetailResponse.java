package com.example.mbs.payload.responses.movie;

import com.example.mbs.models.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDetailResponse {
    private Integer movieId;
    private String title;
    private String description;
    private String releaseDate;
    private String genre;
    private String director;
    private Short durationInMins;
    private String posterUrl;
    private String trailerUrl;
    private String cast;
    private String languages;
    private String rated;
    public static MovieDetailResponse from(Movie movie) {
        return new MovieDetailResponse(
                movie.getMovieId(),
                movie.getTitle(),
                movie.getDescription(),
                movie.getCast(),
                movie.getGenre(),
                movie.getDirector(),
                movie.getDurationInMins(),
                movie.getPosterUrl(),
                movie.getTrailerUrl(),
                movie.getLanguages(),
                movie.getRated(),
                movie.getGenre()
                );
    }
}
