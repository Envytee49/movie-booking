package com.example.mbs.responses.theatre;

import com.example.mbs.models.Theatre;
import com.example.mbs.responses.city.CityResponse;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TheatreResponse {
    private String theatreName;
    private CityResponse city;

}
