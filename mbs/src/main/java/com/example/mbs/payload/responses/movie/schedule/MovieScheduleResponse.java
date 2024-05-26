package com.example.mbs.payload.responses.movie.schedule;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieScheduleResponse {
    private Integer movieId;
    private String title;
    private Date date;
    private List<ShowMovie> shows;
}
