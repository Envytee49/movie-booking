package com.example.mbs.repositories.movie;

import com.example.mbs.models.movie.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
