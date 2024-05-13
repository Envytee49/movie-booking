package com.example.mbs.responses.screen;

import com.example.mbs.constants.SeatStatus;
import com.example.mbs.responses.seat.SeatResponse;
import com.example.mbs.models.screen.Screen;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.stream.Collectors;
@Getter
@Setter
@NoArgsConstructor
public class ScreenDetailResponse {
    private int totalSeat;
    private int freeSeats;
    private Set<SeatResponse> seats;
    public static int totalFreeSeat;
    public ScreenDetailResponse(Screen screen, Integer showId) {
        ScreenDetailResponse.totalFreeSeat = 0;
        this.seats = screen.getSeats().stream().map(seat -> new SeatResponse(seat, showId)).collect(Collectors.toSet());
        this.totalSeat = seats.size();
        this.freeSeats = ScreenDetailResponse.totalFreeSeat;
    }
}
