package com.example.mbs.services.city;

import com.example.mbs.models.city.City;
import com.example.mbs.repositories.city.CityRepository;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
    public Iterable<City> getAllCities() {
        return cityRepository.findAll();
    }
}
