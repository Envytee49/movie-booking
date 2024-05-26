package com.example.mbs.payload.responses.screen;

import com.example.mbs.payload.dto.ScreenDTO;
import com.example.mbs.payload.dto.SeatDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ScreenDetailResponse extends ScreenDTO {
    private int totalSeats;
    private int freeSeats;
    private String theatreName;
    private List<SeatDTO> seats;
    public static int totalFreeSeat;
}
