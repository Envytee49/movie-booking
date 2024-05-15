package com.example.mbs.responses.movie;

import com.example.mbs.models.Movie;
import com.example.mbs.responses.show.Show2Response;
import com.example.mbs.responses.show.ShowResponse;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class Movie2Response {
    private Integer movieId;
    private String title;
    private Set<Show2Response> shows;

}
