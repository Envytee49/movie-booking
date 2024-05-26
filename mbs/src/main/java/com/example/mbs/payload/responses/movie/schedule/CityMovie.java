package com.example.mbs.payload.responses.movie.schedule;

import com.example.mbs.models.City;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityMovie {
    private Integer cityId;
    private String cityName;
    public static CityMovie fromCity(City city) {
        CityMovie cityMovie = new CityMovie();
        cityMovie.setCityName(city.getCityName());
        cityMovie.setCityId(city.getCityId());
        return cityMovie;
    }
}
