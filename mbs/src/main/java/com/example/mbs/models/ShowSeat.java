package com.example.mbs.models;

import com.example.mbs.constants.SeatStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "show_seat")
@NoArgsConstructor
@Getter
@Setter
public class ShowSeat {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seat_id")
    @JsonIgnore
    private Seat seat;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "show_id")
    @JsonIgnore
    private Show show;

    @Column(name = "price")
    private Double price;

    @Enumerated(EnumType.STRING)
    @Column(name = "seat_status", length = 10)
    private SeatStatus seatStatus;
}
