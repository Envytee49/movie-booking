package com.example.mbs.services;

import com.example.mbs.constants.SeatStatus;
import com.example.mbs.exceptions.ResourceNotFoundException;
import com.example.mbs.models.ShowSeat;
import com.example.mbs.models.Seat;
import com.example.mbs.repositories.SeatRepository;
import org.springframework.stereotype.Service;
@Service
public class SeatService {
    private final SeatRepository seatRepository;

    public SeatService(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }
    public void updateSeatStatus(int showId, int seatId) {
        Seat seat = seatRepository.findById(seatId).orElseThrow(ResourceNotFoundException::new);
        ShowSeat showSeatList = seat
                .getShowSeats()
                .stream()
                .filter(showSeat -> showSeat.getShow().getShowId() == showId)
                .toList().get(0);
        showSeatList.setSeatStatus(SeatStatus.BOOKED);
        seatRepository.save(seat);
    }
}
