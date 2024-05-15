package com.example.mbs.responses.theatre;

import com.example.mbs.models.Movie;
import com.example.mbs.models.Theatre;
import com.example.mbs.models.TheatreMovie;
import com.example.mbs.responses.movie.Movie2Response;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.stream.Collectors;
@Getter
@Setter
public class TheatreDetailResponse {
    private String theatreName;
    private Set<Movie2Response> movies;

}
