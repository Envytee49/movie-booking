package com.example.mbs.services;

import com.example.mbs.constants.MovieStatus;
import com.example.mbs.models.Theatre;
import com.example.mbs.responses.movie.Movie2Response;
import com.example.mbs.responses.movie.MovieResponse;
import com.example.mbs.responses.movie.MovieDetailResponse;
import com.example.mbs.exceptions.MovieNotFoundException;
import com.example.mbs.models.Movie;
import com.example.mbs.repositories.MovieRepository;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MovieService {
    private final MovieRepository movieRepository;
    private final ShowService showService;
    public MovieService(MovieRepository movieRepository, ShowService showService) {
        this.movieRepository = movieRepository;
        this.showService = showService;
    }

    public List<MovieDetailResponse> getAllMovies() {
        return movieRepository
                .findAll()
                .stream()
                .map(MovieDetailResponse::new)
                .toList();
    }
    public List<MovieDetailResponse> getMovieByStatus(MovieStatus movieStatus) {
        return movieRepository
                .findByMovieStatus(movieStatus)
                .stream()
                .map(MovieDetailResponse::new)
                .toList();
    }
    public MovieResponse getMovieSchedule(int id, Date date) {
        MovieResponse movieResponse = new MovieResponse();
        Movie movie = movieRepository.findById(id).orElseThrow(MovieNotFoundException::new);
        movieResponse.setMovieId(movie.getMovieId());
        movieResponse.setTitle(movie.getTitle());
        movieResponse.setDate(date);
        movieResponse.setShow(showService.getShowResponse(movie, date));
        return movieResponse;
    }
    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }
    public Movie getMovieById(int id) {
        return movieRepository.findById(id).orElseThrow(MovieNotFoundException::new);
    }
    public void deleteMovieById(int id) {
        movieRepository.deleteById(id);
    }


    public void updateMovieStatus(int id, MovieStatus movieStatus) {
        Movie movie = getMovieById(id);
        movie.setMovieStatus(movieStatus);
        movieRepository.save(movie);
    }
    public Set<Movie2Response> getMovie2Response(Theatre theatre, Date date) {
        return theatre.getTheatreMovies()
                .stream()
                .map(theatreMovie -> getMovie2(theatre.getTheatreId(), theatreMovie.getMovie(), date))
                .collect(Collectors.toSet());
    }
    private Movie2Response getMovie2(int theatreId, Movie movie, Date date) {
        Movie2Response movie2Response = new Movie2Response();
        movie2Response.setMovieId(movie.getMovieId());
        movie2Response.setTitle(movie.getTitle());
        movie2Response.setShows(showService.getShow2Responses(theatreId, movie, date));
        return movie2Response;
    }
}
