package com.example.mbs.services;

import com.example.mbs.exceptions.MovieNotFoundException;
import com.example.mbs.models.Movie;
import com.example.mbs.repositories.movie.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
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


}
