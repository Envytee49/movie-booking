package com.example.mbs.controllers;

import com.example.mbs.constants.MovieStatus;
import com.example.mbs.responses.movie.MovieResponse;
import com.example.mbs.models.Movie;
import com.example.mbs.responses.movie.MovieDetailResponse;
import com.example.mbs.services.MovieService;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;


@RestController
@RequestMapping("api/v1/movie")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/all")
    public List<MovieDetailResponse> getAllMovies() {
        return movieService.getAllMovies();
    }
    @GetMapping("/showing")
    public List<MovieDetailResponse> getShowingMovies() {
        return movieService.getMovieByStatus(MovieStatus.SHOWING);
    }
    @GetMapping("/upcoming")
    public List<MovieDetailResponse> getUpcomingMovies() {
        return movieService.getMovieByStatus(MovieStatus.UPCOMING);
    }
    @GetMapping("/ended")
    public List<MovieDetailResponse> getEndedMovies() {
        return movieService.getMovieByStatus(MovieStatus.ENDED);
    }
    @PostMapping("/add")
    public void addMovie(@RequestBody Movie movie) {
        movieService.addMovie(movie);
    }

    @GetMapping("/{id}")
    public MovieDetailResponse getMovieById(@PathVariable int id) {
        return new MovieDetailResponse(movieService.getMovieById(id));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMovieById(@PathVariable int id) {
        movieService.deleteMovieById(id);
    }

    @GetMapping("/book/{id}")
    public MovieResponse getMovieSchedule(@PathVariable int id, @RequestParam Date date) {
        return movieService.getMovieSchedule(id, date);
    }

    @PutMapping("/update-status/{id}")
    public void updateMovieStatus(@PathVariable int id, @RequestBody MovieStatus movieStatus) {
        movieService.updateMovieStatus(id, movieStatus);
    }

}
