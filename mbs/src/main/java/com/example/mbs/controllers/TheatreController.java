package com.example.mbs.controllers;

import com.example.mbs.payload.requests.ShowDateRequest;
import com.example.mbs.payload.responses.theatre.schedule.TheatreScheduleResponse;
import com.example.mbs.services.TheatreService;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@RestController
@RequestMapping("/api/v1/theatre")
public class TheatreController {
    private final TheatreService theatreService;

    public TheatreController(TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    @GetMapping("/schedule/{id}")
    public TheatreScheduleResponse getTheatreDetail(@PathVariable int id, @RequestBody ShowDateRequest date) {
        Date showDate = Date.valueOf(date.getDate());
        return theatreService.getTheatreSchedule(id, showDate);
    }
}
