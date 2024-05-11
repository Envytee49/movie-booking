package com.example.mbs.controllers.show;

import com.example.mbs.dto.show.ShowDetailDTO;
import com.example.mbs.models.show.Show;
import com.example.mbs.services.show.ShowService;
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

    @GetMapping("/book/{movieName}/{id}")
    public ShowDetailDTO getShowDetail(@PathVariable int id, @PathVariable String movieName) {
        return new ShowDetailDTO(showService.getShowDetail(id), movieName);
    }
}
