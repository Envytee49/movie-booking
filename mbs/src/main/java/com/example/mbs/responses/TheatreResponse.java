package com.example.mbs.responses;

import com.example.mbs.models.Theatre;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TheatreResponse {
    private String theatreName;
    private CityResponse city;
    public TheatreResponse(Theatre theatre) {
        this.theatreName = theatre.getTheatreName();
        this.city = new CityResponse(theatre.getCity());
    }
}
