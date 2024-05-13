package com.example.mbs.responses.seat;

import com.example.mbs.constants.SeatStatus;
import com.example.mbs.models.ShowSeat;
import com.example.mbs.models.seat.Seat;
import com.example.mbs.responses.screen.ScreenDetailResponse;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class SeatResponse {
    private Integer seatId;
    private String rowNum;
    private Short seatNum;
    private String seatType;
    private Set<ShowSeat> showSeat;
    public SeatResponse(Seat seat, Integer showId) {
        this.seatId = seat.getSeatId();
        this.rowNum = seat.getRowNum();
        this.seatNum = seat.getSeatNum();
        this.seatType = seat.getSeatType();
        this.showSeat = seat
                .getShowSeats()
                .stream()
                .filter((showSeat) -> {
                    int refShowId = showSeat.getShow().getShowId();
                    if(showSeat.getSeatStatus() == SeatStatus.FREE && refShowId == showId)
                        ScreenDetailResponse.totalFreeSeat++;
                    return refShowId == showId;
                })
                .collect(Collectors.toSet());
    }
}
