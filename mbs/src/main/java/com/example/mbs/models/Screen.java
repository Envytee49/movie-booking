package com.example.mbs.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "screens")
public class Screen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "screen_id")
    private Integer screenId;

    @Column(name = "screen_name", length = 20)
    private String screenName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "theatre_id")
    private Theatre theatre;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "format_id")
    private Format format;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sscreen_id")
    private SpecialScreen specialScreen;

    @OneToMany(
            mappedBy = "screen",
            cascade = CascadeType.ALL,
            orphanRemoval = true

    )
    private List<Show> shows;

    @OneToMany(
            mappedBy = "screen",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY)
    private List<Seat> seats;
}