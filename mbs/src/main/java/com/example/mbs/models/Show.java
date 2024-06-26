package com.example.mbs.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
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

    @ManyToOne(fetch = FetchType.EAGER)
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
    private List<ShowSeat> showSeats;

    @OneToMany(mappedBy = "show")
    private List<Reservation> reservations;

}
