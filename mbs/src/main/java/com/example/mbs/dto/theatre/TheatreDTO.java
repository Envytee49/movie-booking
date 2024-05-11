package com.example.mbs.dto.theatre;

import com.example.mbs.dto.city.CityDTO;
import com.example.mbs.models.theatre.Theatre;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TheatreDTO {
    private String theatreName;
    private CityDTO city;
    public TheatreDTO(Theatre theatre) {
        this.theatreName = theatre.getTheatreName();
        this.city = new CityDTO(theatre.getCity());
    }
}
