package com.example.mbs.controllers;

import com.example.mbs.constants.MovieStatus;
import com.example.mbs.payload.dto.MovieDTO;
import com.example.mbs.payload.requests.ShowDateRequest;
import com.example.mbs.payload.responses.movie.MovieDetailResponse;
import com.example.mbs.models.Movie;
import com.example.mbs.payload.responses.movie.schedule.MovieScheduleResponse;
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
    public List<MovieDTO> getAllMovies() {
        return movieService.getAllMovies();
    }
    @GetMapping("movie-status/{movieStatus}")
    public List<MovieDetailResponse> getMovieByStatus(@PathVariable MovieStatus movieStatus) {
        return movieService.getMovieByStatus(movieStatus);
    }
//    @GetMapping("/upcoming")
//    public List<MovieDetailResponse> getUpcomingMovies() {
//        return movieService.getMovieByStatus(MovieStatus.UPCOMING);
//    }
//    @GetMapping("/ended")
//    public List<MovieDetailResponse> getEndedMovies() {
//        return movieService.getMovieByStatus(MovieStatus.ENDED);
//    }
    @PostMapping("/add")
    public void addMovie(@RequestBody Movie movie) {
        movieService.addMovie(movie);
    }

    @GetMapping("/{id}")
    public MovieDetailResponse getMovieById(@PathVariable int id) {
        return movieService.getMovieById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMovieById(@PathVariable int id) {
        movieService.deleteMovieById(id);
    }

    @GetMapping("/schedule/{id}")
    public MovieScheduleResponse getMovieSchedule(@PathVariable int id, @RequestBody ShowDateRequest date) {
        Date showDate = Date.valueOf(date.getDate());
        return movieService.getMovieSchedule(id, showDate);
    }

    @PutMapping("/update-status/{id}")
    public void updateMovieStatus(@PathVariable int id, @RequestBody MovieStatus movieStatus) {
        movieService.updateMovieStatus(id, movieStatus);
    }

}
