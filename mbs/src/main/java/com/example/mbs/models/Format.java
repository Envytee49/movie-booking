package com.example.mbs.models;

import com.example.mbs.models.screen.Screen;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "formats")
@NoArgsConstructor
@Getter
@Setter
public class Format {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "format_id")
    private Integer formatId;

    @Column(name = "format_type", length = 20)
    private String formatType;

    @ManyToMany(mappedBy = "formats")
    private Set<Movie> movies;

    @OneToMany(mappedBy = "format")
    private Set<Screen> screens;
}