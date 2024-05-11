package com.example.mbs.services.movie;

import com.example.mbs.exceptions.MovieNotFoundException;
import com.example.mbs.models.movie.Movie;
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
