package com.example.mbs.responses.city;

import com.example.mbs.models.City;
import com.example.mbs.models.Theatre;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
public class CityDetailResponse {
    private String cityName;
    private Set<Theatre> theatres;

    public CityDetailResponse(City city) {
        this.cityName = city.getCityName();
        this.theatres = city.getTheatres();
    }
}
