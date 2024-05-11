package com.example.mbs.models.seat;

import com.example.mbs.models.fare.Fare;
import com.example.mbs.models.reservation.Reservation;
import com.example.mbs.models.screen.Screen;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "seats")
@NoArgsConstructor
@Data
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
    private Screen screen;

    @OneToMany(mappedBy = "seat")
    private Set<Fare> fares;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
}
