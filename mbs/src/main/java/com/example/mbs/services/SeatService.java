package com.example.mbs.services;

import com.example.mbs.constants.SeatStatus;
import com.example.mbs.exceptions.SeatNotFoundException;
import com.example.mbs.models.ShowSeat;
import com.example.mbs.models.seat.Seat;
import com.example.mbs.repositories.seat.SeatRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
@Service
public class SeatService {
    private final SeatRepository seatRepository;
    private ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

    public SeatService(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }
    public void updateSeatStatus(int showId, int seatId) {
        Seat seat = seatRepository.findById(seatId).orElseThrow(SeatNotFoundException::new);
        ShowSeat showSeatList = seat
                .getShowSeats()
                .stream()
                .filter(showSeat -> showSeat.getShow().getShowId() == showId)
                .toList().get(0);
        showSeatList.setSeatStatus(SeatStatus.BOOKED);
        Seat seatRef = seatRepository.save(seat);

        executor.schedule(() -> {
            showSeatList.setSeatStatus(SeatStatus.FREE);
            seatRepository.save(seatRef);
        }, 2, TimeUnit.MINUTES);

    }
}
