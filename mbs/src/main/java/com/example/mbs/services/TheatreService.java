package com.example.mbs.services;

import com.example.mbs.exceptions.ResourceNotFoundException;
import com.example.mbs.models.*;
import com.example.mbs.payload.dto.FormatDTO;
import com.example.mbs.payload.dto.MovieDTO;
import com.example.mbs.payload.dto.SpecialScreenDTO;
import com.example.mbs.payload.responses.theatre.schedule.ScreenTheatre;
import com.example.mbs.payload.responses.theatre.schedule.ShowTheatre;
import com.example.mbs.payload.responses.theatre.schedule.TheatreScheduleResponse;
import com.example.mbs.repositories.TheatreRepository;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class TheatreService {
    private final TheatreRepository theatreRepository;
    public TheatreService(TheatreRepository theatreRepository) {
        this.theatreRepository = theatreRepository;
    }

    public TheatreScheduleResponse getTheatreSchedule(int id, Date date) {

        Theatre theatre = theatreRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
        TheatreScheduleResponse theatreScheduleResponse = new TheatreScheduleResponse();
        theatreScheduleResponse.setTheatreName(theatre.getTheatreName());

        List<ScreenTheatre> screenTheatres = new ArrayList<>();
        List<Screen> screens = theatre
                .getScreens()
                .stream()
                .filter(screen -> screen.getTheatre().getTheatreId() == id)
                .toList();
        for (Screen screen : screens) {
            // create screen theatre
            ScreenTheatre screenTheatre = new ScreenTheatre();
            screenTheatre.setScreenId(screen.getScreenId());
            screenTheatre.setScreenName(screen.getScreenName());

            Format format = screen.getFormat();
            FormatDTO formatDTO = new FormatDTO();
            formatDTO.setFormatId(format.getFormatId());
            formatDTO.setFormatType(format.getFormatType());

            SpecialScreen specialScreen = screen.getSpecialScreen();
            SpecialScreenDTO specialScreenDTO = new SpecialScreenDTO();
            specialScreenDTO.setSscreenName(specialScreen.getSscreenName());

            // create show theatre
            List<ShowTheatre> showTheatres = new ArrayList<>();
            for(Show show : screen.getShows()) {
                ShowTheatre showTheatre = new ShowTheatre();
                showTheatre.setShowId(show.getShowId());
                showTheatre.setStartTime(show.getStartTime());

                // create Movie
                Movie movie = show.getMovie();
                MovieDTO movieDTO = MovieDTO.from(movie);

                showTheatre.setMovie(movieDTO);

                showTheatres.add(showTheatre);
            }



            screenTheatre.setSpecialScreen(specialScreenDTO);
            screenTheatre.setFormat(formatDTO);
            screenTheatre.setShows(showTheatres);

            screenTheatres.add(screenTheatre);

        }
        theatreScheduleResponse.setScreens(screenTheatres);
        return theatreScheduleResponse;
    }

}
