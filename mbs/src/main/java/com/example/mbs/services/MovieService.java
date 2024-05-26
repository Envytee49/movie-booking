package com.example.mbs.services;

import com.example.mbs.constants.MovieStatus;
import com.example.mbs.exceptions.ResourceNotFoundException;
import com.example.mbs.models.*;
import com.example.mbs.payload.dto.FormatDTO;
import com.example.mbs.payload.dto.MovieDTO;
import com.example.mbs.payload.dto.SpecialScreenDTO;
import com.example.mbs.payload.responses.movie.MovieDetailResponse;
import com.example.mbs.payload.responses.movie.schedule.*;
import com.example.mbs.payload.responses.movie.schedule.TheatreMovie;
import com.example.mbs.repositories.MovieRepository;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieDTO> getAllMovies() {
        return movieRepository
                .findAll()
                .stream()
                .map(MovieDTO::from)
                .toList();
    }
    public List<MovieDetailResponse> getMovieByStatus(MovieStatus movieStatus) {
        return movieRepository
                .findByMovieStatus(movieStatus)
                .stream()
                .map(MovieDetailResponse::from)
                .toList();
    }
    public MovieScheduleResponse getMovieSchedule(int id, Date showDate) {
        MovieScheduleResponse movieScheduleResponse = new MovieScheduleResponse();
        Movie movie = movieRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
        movieScheduleResponse.setMovieId(movie.getMovieId());
        movieScheduleResponse.setTitle(movie.getTitle());
        movieScheduleResponse.setDate(showDate);

        List<ShowMovie> showDTOs = new ArrayList<>();

        List<Show> showsByShowDate = movie
                .getShows()
                .stream()
                .filter(show -> show.getShowDate().equals(showDate)
                        && show.getStartTime().toLocalTime().isAfter(LocalTime.now()))
                .toList();
        for (Show show : showsByShowDate) {
            if (    show.getShowDate().equals(showDate) &&
                    show.getStartTime().toLocalTime().isAfter(LocalTime.now())) {
                ShowMovie showMovie = getShowMovie(show);
                showDTOs.add(showMovie);
            }
        }
        movieScheduleResponse.setShows(showDTOs);
        return movieScheduleResponse;
    }

    private static ShowMovie getShowMovie(Show show) {
        ShowMovie showMovie = new ShowMovie();
        showMovie.setShowId(show.getShowId());
        showMovie.setStartTime(show.getStartTime());

        Screen screen = show.getScreen();
        ScreenMovie screenMovie = new ScreenMovie();
        screenMovie.setScreenName(screen.getScreenName());
        screenMovie.setScreenId(screen.getScreenId());

        Format format = screen.getFormat();
        FormatDTO formatDTO = new FormatDTO();
        formatDTO.setFormatId(format.getFormatId());
        formatDTO.setFormatType(format.getFormatType());

        SpecialScreen specialScreen = screen.getSpecialScreen();
        SpecialScreenDTO specialScreenDTO = new SpecialScreenDTO();
        specialScreenDTO.setSscreenName(specialScreen.getSscreenName());

        Theatre theatre = screen.getTheatre();
        TheatreMovie theatreMovie = new TheatreMovie();
        theatreMovie.setTheatreName(theatre.getTheatreName());
        theatreMovie.setTheatreName(theatre.getTheatreName());

        City city = theatre.getCity();
        CityMovie cityMovie = new CityMovie();
        cityMovie.setCityId(city.getCityId());
        cityMovie.setCityName(city.getCityName());

        theatreMovie.setCity(cityMovie);
        screenMovie.setTheatre(theatreMovie);
        screenMovie.setFormat(formatDTO);
        screenMovie.setSpecialScreen(specialScreenDTO);
        showMovie.setScreens(screenMovie);
        return showMovie;
    }

    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }
    public MovieDetailResponse getMovieById(int id) {
        Movie movie = movieRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
        return MovieDetailResponse.from(movie);
    }
    public void deleteMovieById(int id) {
        movieRepository.deleteById(id);
    }

    public void updateMovieStatus(int id, MovieStatus movieStatus) {
        Movie movie = movieRepository.findById(id).orElseThrow(ResourceNotFoundException::new);;
        movie.setMovieStatus(movieStatus);
        movieRepository.save(movie);
    }
}
