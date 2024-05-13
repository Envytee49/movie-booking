package com.example.mbs.services;

import com.example.mbs.constants.MovieStatus;
import com.example.mbs.responses.movie.MovieResponse;
import com.example.mbs.responses.movie.MovieDetailResponse;
import com.example.mbs.exceptions.MovieNotFoundException;
import com.example.mbs.models.Movie;
import com.example.mbs.repositories.movie.MovieRepository;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
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
        return new MovieResponse(getMovieById(id), date);
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
}
