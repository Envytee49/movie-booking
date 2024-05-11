package com.example.mbs.models.city;

import com.example.mbs.models.theatre.Theatre;
import com.example.mbs.models.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "cities")
@NoArgsConstructor
@Data
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