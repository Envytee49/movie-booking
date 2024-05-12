package com.example.mbs.models.show;
import com.example.mbs.models.Fare;
import com.example.mbs.models.Movie;
import com.example.mbs.models.Reservation;
import com.example.mbs.models.screen.Screen;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;
import java.util.Set;
@Entity
@Table(name = "shows")
@Getter
@Setter
@NoArgsConstructor
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "show_id")
    private Integer showId;

    @Column(name = "start_time",  columnDefinition = "TIME(0)")
    private Time startTime;

    @Column(name = "show_date")
    @Temporal(TemporalType.DATE)
    private Date showDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "screen_id")
    private Screen screen;

    @OneToMany(
            mappedBy = "show",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Fare> fares;

    @OneToMany(mappedBy = "show")
    private Set<Reservation> reservations;

}
