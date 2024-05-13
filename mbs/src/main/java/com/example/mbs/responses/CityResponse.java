package com.example.mbs.responses;

import com.example.mbs.models.City;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CityResponse {
    private String cityName;
    public CityResponse(City city){
        this.cityName = city.getCityName();
    }
}
