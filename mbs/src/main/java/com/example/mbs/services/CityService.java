package com.example.mbs.services;

import com.example.mbs.models.City;
import com.example.mbs.models.Theatre;
import com.example.mbs.repositories.CityRepository;
import com.example.mbs.responses.city.CityDetailResponse;
import com.example.mbs.responses.city.CityResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
    public List<CityDetailResponse> getAllCities() {
        return cityRepository.findAll().stream().map(CityDetailResponse::new).toList();
    }
    public CityResponse getCityResponse(Theatre theatre) {
        City city = theatre.getCity();
        CityResponse cityResponse = new CityResponse();
        cityResponse.setCityName(city.getCityName());
        return cityResponse;
    }
}
