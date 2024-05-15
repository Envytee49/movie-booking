package com.example.mbs.models;

import jakarta.persistence.*;

@Entity
@Table(name = "movie_format")
public class MovieFormat {
    @Id
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @Id
    @ManyToOne
    @JoinColumn(name = "format_id")
    private Format format;

}
