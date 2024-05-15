package com.example.mbs.services;

import com.example.mbs.exceptions.ShowNotFoundException;
import com.example.mbs.models.Movie;
import com.example.mbs.models.show.Show;
import com.example.mbs.repositories.ShowRepository;
import com.example.mbs.responses.show.Show2Response;
import com.example.mbs.responses.show.ShowDetailResponse;
import com.example.mbs.responses.show.ShowResponse;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalTime;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ShowService {
    private final ShowRepository showRepository;
    private final ScreenService screenService;
    public ShowService(ShowRepository showRepository, ScreenService screenService) {
        this.showRepository = showRepository;
        this.screenService = screenService;
    }

    public ShowDetailResponse getShowDetail(int id) {
        return new ShowDetailResponse(showRepository.findById(id).orElseThrow(ShowNotFoundException::new));
    }

    public Set<ShowResponse> getShowResponse(Movie movie, Date date) {
        return movie.getShows().stream()
                .filter(show -> show.getShowDate().equals(date)
                        && show.getStartTime().toLocalTime().isAfter(LocalTime.now()))
                .map(this::getShow)
                .collect(Collectors.toSet());
    }

    private ShowResponse getShow(Show show) {
        ShowResponse showResponse = new ShowResponse();
        showResponse.setShowId(show.getShowId());
        showResponse.setStartTime(show.getStartTime());
        showResponse.setScreen(screenService.getScreenResponse(show));
        return showResponse;
    }
    public Set<Show2Response> getShow2Responses(int theatreId, Movie movie, Date date) {
        Set<Show> shows = showRepository.findShowsByTheatreId(theatreId, date);
        return shows
                .stream()
                .filter(show -> show.getMovie().getMovieId() == movie.getMovieId())
                .map(show -> getShow2(show))
                .collect(Collectors.toSet());
    }
//    private Boolean isShowAtTheatre(int theatreId, Show show) {
//        return screenService.isScreenAtTheatre(show, theatreId);
//    }
    private Show2Response getShow2(Show show) {
        Show2Response show2Response = new Show2Response();
        show2Response.setShowId(show.getShowId());
        show2Response.setStartTime(show.getStartTime());
        return show2Response;
    }
}
