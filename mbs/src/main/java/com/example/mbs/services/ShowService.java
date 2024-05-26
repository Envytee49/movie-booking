package com.example.mbs.services;

import com.example.mbs.constants.SeatStatus;
import com.example.mbs.exceptions.ResourceNotFoundException;
import com.example.mbs.models.Screen;
import com.example.mbs.models.Seat;
import com.example.mbs.models.Show;
import com.example.mbs.payload.dto.SeatDTO;
import com.example.mbs.payload.responses.screen.ScreenDetailResponse;
import com.example.mbs.payload.responses.show.ShowDetailResponse;
import com.example.mbs.repositories.ShowRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowService {
    private final ShowRepository showRepository;
    public ShowService(ShowRepository showRepository) {
        this.showRepository = showRepository;
    }

    public ShowDetailResponse getShowDetail(int showId) {
        Show show = showRepository.findById(showId).orElseThrow(ResourceNotFoundException::new);
        ShowDetailResponse showDetailResponse = new ShowDetailResponse();
        showDetailResponse.setShowDate(show.getShowDate());
        showDetailResponse.setShowId(show.getShowId());
        showDetailResponse.setMovieTitle(show.getMovie().getTitle());
        showDetailResponse.setStartTime(show.getStartTime());

        ScreenDetailResponse.totalFreeSeat = 0;
        ScreenDetailResponse screenDetailResponse = new ScreenDetailResponse();
        Screen screen = show.getScreen();
        screenDetailResponse.setTheatreName(screen.getTheatre().getTheatreName());
        screenDetailResponse.setScreenId(screen.getScreenId());
        screenDetailResponse.setScreenName(screen.getScreenName());

        List<SeatDTO> seatDTOS = new ArrayList<>();
        List<Seat> seats = screen.getSeats();
        for(Seat seat : seats) {
            SeatDTO seatDTO  = new SeatDTO();
            seatDTO.setSeatId(seat.getSeatId());
            seatDTO.setSeatNum(seat.getSeatNum());
            seatDTO.setSeatType(seat.getSeatType());
            seatDTO.setRowNum(seat.getRowNum());
            seatDTO.setShowSeat(seat
                    .getShowSeats()
                    .stream()
                    .filter((showSeat) -> {
                        int refShowId = showSeat.getShow().getShowId();
                        if(showSeat.getSeatStatus() == SeatStatus.FREE && refShowId == showId)
                            ScreenDetailResponse.totalFreeSeat++;
                        return refShowId == showId;
                    })
                    .toList()
                    .get(0));

            seatDTOS.add(seatDTO);
        }

        screenDetailResponse.setTotalSeats(seats.size());
        screenDetailResponse.setFreeSeats(ScreenDetailResponse.totalFreeSeat);
        screenDetailResponse.setSeats(seatDTOS);

        showDetailResponse.setScreen(screenDetailResponse);
        return showDetailResponse;
    }

}
