package com.example.mbs.responses.movie;

import com.example.mbs.responses.show.ShowResponse;
import com.example.mbs.models.Movie;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.Set;
import java.util.stream.Collectors;
@Getter
@Setter
@NoArgsConstructor
public class MovieResponse {
    private Integer movieId;
    private String title;
    private Date date;
    private Set<ShowResponse> show;
}
