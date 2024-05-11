package com.example.mbs.controllers.city;

import com.example.mbs.models.city.City;
import com.example.mbs.services.city.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/city")
public class CityController {
    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/")
    Iterable<City> getAllCities() {
        return cityService.getAllCities();
    }
}
