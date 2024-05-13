package com.example.mbs.controllers;

import com.example.mbs.services.SeatService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/seat")
public class SeatController {
    private final SeatService seatService;

    public SeatController(SeatService seatService) {
        this.seatService = seatService;
    }

    @PutMapping("/{showId}/{seatId}")
    public void updateSeatStatus(@PathVariable int showId, @PathVariable int seatId) {
        seatService.updateSeatStatus(showId, seatId);
    }

}
