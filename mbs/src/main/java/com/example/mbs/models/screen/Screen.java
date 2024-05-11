package com.example.mbs.models.screen;

import com.example.mbs.models.format.Format;
import com.example.mbs.models.screen.specialscreen.SpecialScreen;
import com.example.mbs.models.seat.Seat;
import com.example.mbs.models.show.Show;
import com.example.mbs.models.theatre.Theatre;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@NoArgsConstructor
@Data
@Entity
@Table(name = "screens")
public class Screen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "screen_id")
    private Integer screenId;

    @Column(name = "screen_name", length = 20)
    private String screenName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "theatre_id")
    private Theatre theatre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "format_id")
    private Format format;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sscreen_id")
    private SpecialScreen specialScreen;

    @OneToMany(
            mappedBy = "screen",
            cascade = CascadeType.ALL,
            orphanRemoval = true

    )
    private Set<Show> shows;

    @OneToMany(
            mappedBy = "screen",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private Set<Seat> seats;
}