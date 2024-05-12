package com.example.mbs.dto.movie;

import com.example.mbs.dto.show.ShowDTO;
import com.example.mbs.models.Movie;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Set;
import java.util.stream.Collectors;
@Data
@NoArgsConstructor
public class MovieDTO {
    private Integer movieId;
    private String title;
    private Date date;
    private Set<ShowDTO> shows;
    public MovieDTO(Movie movie, Date date) {
        this.movieId = movie.getMovieId();
        this.title = movie.getTitle();
        this.date = date;
        this.shows = movie.getShows().stream()
                .filter(show -> show.getShowDate().equals(date)
//                        && show.getStartTime().toLocalTime().isAfter(LocalTime.now()))
                )
                .map(ShowDTO::new)

                .collect(Collectors.toSet());
    }
}
