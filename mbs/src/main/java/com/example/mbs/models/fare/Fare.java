package com.example.mbs.models.fare;

import com.example.mbs.models.seat.Seat;
import com.example.mbs.models.show.Show;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fares")
@NoArgsConstructor
@Data
public class Fare {
    @Id
    @ManyToOne
    @JoinColumn(name = "seat_id")
    private Seat seat;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "show_id")
    private Show show;

    @Column(name = "price")
    private Double price;
}
