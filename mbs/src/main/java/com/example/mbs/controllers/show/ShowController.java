package com.example.mbs.controllers.show;

import com.example.mbs.requests.ShowRequest;
import com.example.mbs.responses.show.ShowDetailResponse;
import com.example.mbs.services.ShowService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/show")
public class ShowController {
    private final ShowService showService;

    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    @GetMapping("/book/{id}")
    public ShowDetailResponse getShowDetail(@PathVariable int id, @RequestBody ShowRequest showRequest) {
        return new ShowDetailResponse(showService.getShowDetail(id), showRequest);
    }
}
