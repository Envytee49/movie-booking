package com.example.mbs.models;

import com.example.mbs.models.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "cities")
@NoArgsConstructor
@Getter
@Setter
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private Integer cityId;

    @Column(name = "city_name", length = 50)
    private String cityName;

    @OneToMany(
            mappedBy = "city",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Theatre> theatres;

    @OneToMany(mappedBy = "city")
    @JsonIgnore
    private Set<User> users;

    // Getters and setters...
}