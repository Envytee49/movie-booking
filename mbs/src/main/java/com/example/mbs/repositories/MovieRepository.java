package com.example.mbs.repositories;

import com.example.mbs.constants.MovieStatus;
import com.example.mbs.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    List<Movie> findByMovieStatus(MovieStatus movieStatus);
}
