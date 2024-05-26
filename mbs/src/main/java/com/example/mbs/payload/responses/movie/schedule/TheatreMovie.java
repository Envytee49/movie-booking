package com.example.mbs.payload.responses.movie.schedule;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TheatreMovie {
    private String theatreName;
    private CityMovie city;
}
