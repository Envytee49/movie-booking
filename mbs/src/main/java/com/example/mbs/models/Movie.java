package com.example.mbs.models;

import com.example.mbs.constants.MovieStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "movies")
@Getter
@Setter
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Integer movieId;

    @Column(length = 255)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(length = 255)
    private String rated;

    @Column(name = "duration_in_mins")
    private Short durationInMins;

    @Column(name = "poster_url", length = 255)
    private String posterUrl;

    @Column(name = "trailer_url", length = 255)
    private String trailerUrl;

    @Column(name = "release_date")
    @Temporal(TemporalType.DATE)
    private LocalDate releaseDate;

    @Column(length = 255)
    private String genre;

    @Column(length = 255)
    private String director;

    @Column(length = 255)
    private String cast;

    @Column(length = 255)
    private String languages;

    @Enumerated(EnumType.STRING)
    @Column(name = "movie_status", length = 255)
    private MovieStatus movieStatus;
    @OneToMany(
            mappedBy = "movie",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Review> reviews;

    @OneToMany(
            mappedBy = "movie",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Show> shows;

    @OneToMany(
            mappedBy = "movie",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<MovieFormat> movieFormats;

    @OneToMany(
            mappedBy = "movie",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<TheatreMovie> theatreMovies;


}
