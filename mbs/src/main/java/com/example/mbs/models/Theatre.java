package com.example.mbs.models;

import com.example.mbs.models.City;
import com.example.mbs.models.screen.Screen;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private String address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    private City city;

    @OneToMany(
            mappedBy = "theatre",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Screen> screens;

}