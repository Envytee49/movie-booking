package com.example.mbs.dto.seat;

import com.example.mbs.models.seat.Seat;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SeatDTO {
    private Integer seatId;
    private String rowNum;
    private Short seatNum;
    private String seatType;
    private String seatStatus;
    public SeatDTO(Seat seat) {
        this.seatId = seat.getSeatId();
        this.rowNum = seat.getRowNum();
        this.seatNum = seat.getSeatNum();
        this.seatType = seat.getSeatType();
        this.seatStatus = seat.getSeatStatus();
    }
}
