package com.example.mbs.services;

import com.example.mbs.exceptions.TheatreNotFoundException;
import com.example.mbs.models.Theatre;
import com.example.mbs.models.screen.Screen;
import com.example.mbs.repositories.TheatreRepository;
import com.example.mbs.responses.theatre.TheatreDetailResponse;
import com.example.mbs.responses.theatre.TheatreResponse;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import java.sql.Date;

@Service
public class TheatreService {
    private final TheatreRepository theatreRepository;
    private final MovieService movieService;
    private final CityService cityService;
    public TheatreService(TheatreRepository theatreRepository, @Lazy MovieService movieService, CityService cityService) {
        this.theatreRepository = theatreRepository;
        this.movieService = movieService;
        this.cityService = cityService;
    }

    public TheatreDetailResponse getTheatreDetail(int id, Date date) {
        Theatre theatre = theatreRepository.findById(id).orElseThrow(TheatreNotFoundException::new);
        TheatreDetailResponse theatreDetailResponse = new TheatreDetailResponse();
        theatreDetailResponse.setTheatreName(theatre.getTheatreName());
        theatreDetailResponse.setMovies(movieService.getMovie2Response(theatre, date));
        return theatreDetailResponse;
    }
    public TheatreResponse getTheatreResponse(Screen screen) {
        TheatreResponse theatreResponse = new TheatreResponse();
        Theatre theatre = screen.getTheatre();
        theatreResponse.setTheatreName(theatre.getTheatreName());
        theatreResponse.setCity(cityService.getCityResponse(theatre));
        return theatreResponse;
    }
}
