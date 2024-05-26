package com.example.mbs.controllers;

import com.example.mbs.payload.responses.show.ShowDetailResponse;
import com.example.mbs.services.ShowService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/show")
public class ShowController {
    private final ShowService showService;

    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    @GetMapping("/book/{id}")
    public ShowDetailResponse getShowDetail(@PathVariable int id) {
        return showService.getShowDetail(id);
    }
}
