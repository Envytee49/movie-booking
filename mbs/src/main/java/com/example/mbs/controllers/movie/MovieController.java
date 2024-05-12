package com.example.mbs.controllers.movie;

import com.example.mbs.dto.movie.MovieDTO;
import com.example.mbs.models.Movie;
import com.example.mbs.dto.movie.MovieDetailDTO;
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

    @GetMapping("/")
    public List<MovieDetailDTO> getAllMovies() {
        return movieService.getAllMovies()
                .stream()
                .map(MovieDetailDTO::new)
                .toList();
    }

    @PostMapping("/add")
    public void addMovie(@RequestBody Movie movie) {
        movieService.addMovie(movie);
    }

    @GetMapping("/{id}")
    public MovieDetailDTO getMovieById(@PathVariable int id) {
        return new MovieDetailDTO(movieService.getMovieById(id));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMovieById(@PathVariable int id) {
        movieService.deleteMovieById(id);
    }

    @GetMapping("/book/{id}")
    public MovieDTO getMovieSchedule(@PathVariable int id, @RequestParam Date date) {
        MovieDTO movieDTO = new MovieDTO(movieService.getMovieById(id), date);
        return movieDTO;
    }

}
