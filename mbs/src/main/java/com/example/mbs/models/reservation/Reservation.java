package com.example.mbs.models.reservation;
import com.example.mbs.models.seat.Seat;
import com.example.mbs.models.show.Show;
import com.example.mbs.models.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "reservations")
@NoArgsConstructor
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private Integer reservationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "show_id", nullable = false)
    private Show show;

    @Column(name = "reservation_code", length = 20)
    private String reservationCode;

    @Column(name = "createdOn")
    @Temporal(TemporalType.DATE)
    private Date createdOn;

    @OneToMany(mappedBy = "reservation")
    private Set<Seat> seats;
}
