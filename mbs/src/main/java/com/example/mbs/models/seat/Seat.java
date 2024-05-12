package com.example.mbs.models.seat;

import com.example.mbs.models.Fare;
import com.example.mbs.models.Reservation;
import com.example.mbs.models.screen.Screen;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "seats")
@NoArgsConstructor
@Getter
@Setter
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id")
    private Integer seatId;

    @Column(name = "row_num", length = 1)
    private String rowNum;

    @Column(name = "seat_num")
    private Short seatNum;

    @Column(name = "seat_type", length = 20)
    private String seatType;

    @Column(name = "seat_status", length = 20)
    private String seatStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "screen_id")
    @JsonIgnore
    private Screen screen;

    @OneToMany(mappedBy = "seat")
    @JsonIgnore
    private Set<Fare> fares;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reservation_id")
    @JsonIgnore
    private Reservation reservation;
}
