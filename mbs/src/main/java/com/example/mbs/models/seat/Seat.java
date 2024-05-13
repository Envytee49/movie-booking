package com.example.mbs.models.seat;

import com.example.mbs.constants.SeatStatus;
import com.example.mbs.models.ShowSeat;
import com.example.mbs.models.Reservation;
import com.example.mbs.models.screen.Screen;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "screen_id")
    private Screen screen;

    @OneToMany(mappedBy = "seat", fetch = FetchType.EAGER)
    private Set<ShowSeat> showSeats;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
}
