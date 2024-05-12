package com.example.mbs.dto.city;

import com.example.mbs.models.City;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CityDTO {
    private String cityName;
    public CityDTO(City city){
        this.cityName = city.getCityName();
    }
}
