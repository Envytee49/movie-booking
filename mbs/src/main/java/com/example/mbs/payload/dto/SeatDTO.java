package com.example.mbs.payload.dto;

import com.example.mbs.models.ShowSeat;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SeatDTO {
    private Integer seatId;
    private String rowNum;
    private Short seatNum;
    private String seatType;
    private ShowSeat showSeat;
}
