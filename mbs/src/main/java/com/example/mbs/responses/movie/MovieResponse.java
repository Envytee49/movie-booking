package com.example.mbs.responses.movie;

import com.example.mbs.responses.show.ShowResponse;
import com.example.mbs.models.Movie;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Set;
import java.util.stream.Collectors;
@Data
@NoArgsConstructor
public class MovieResponse {
    private Integer movieId;
    private String title;
    private Date date;
    private Set<ShowResponse> shows;
    public MovieResponse(Movie movie, Date date) {
        this.movieId = movie.getMovieId();
        this.title = movie.getTitle();
        this.date = date;
        this.shows = movie.getShows().stream()
                .filter(show -> show.getShowDate().equals(date)
//                        && show.getStartTime().toLocalTime().isAfter(LocalTime.now()))
                )
                .map(ShowResponse::new)

                .collect(Collectors.toSet());
    }
}
