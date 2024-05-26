package com.example.mbs.services;

import com.example.mbs.models.City;
import com.example.mbs.models.Theatre;
import com.example.mbs.payload.responses.movie.schedule.CityMovie;
import com.example.mbs.repositories.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
    public List<CityMovie> getAllCities() {
        return cityRepository.findAll().stream().map(CityMovie::fromCity).toList();
    }
    public List<City> getCityTheatres() {
        return cityRepository.findAll();
    }
    public CityMovie getCity(Theatre theatre) {
        City city = theatre.getCity();
        return CityMovie.fromCity(city);
    }
}
