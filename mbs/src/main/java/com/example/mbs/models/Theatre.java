package com.example.mbs.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "theatres")
@NoArgsConstructor
@Getter
@Setter
public class Theatre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "theatre_id")
    private Integer theatreId;

    @Column(name = "theatre_name", length = 100)
    private String theatreName;

    @Column(length = 20)
    @JsonIgnore
    private String address;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "city_id")
    @JsonBackReference
    private City city;

    @OneToMany(
            mappedBy = "theatre",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JsonIgnore
    private List<Screen> screens;

    @OneToMany(mappedBy = "theatre")
    @JsonIgnore
    private List<TheatreMovie> theatreMovies;
}