package com.example.mbs.controllers;

import com.example.mbs.responses.theatre.TheatreDetailResponse;
import com.example.mbs.services.TheatreService;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/theatre")
public class TheatreController {
    private final TheatreService theatreService;

    public TheatreController(TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    @GetMapping("/{id}")
    public TheatreDetailResponse getTheatreDetail(@PathVariable int id, @RequestParam Date date) {
        return theatreService.getTheatreDetail(id, date);
    }
}
