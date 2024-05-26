package com.example.mbs.payload.responses.theatre.schedule;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TheatreScheduleResponse {
    private String theatreName;
    private List<ScreenTheatre> screens;
}
